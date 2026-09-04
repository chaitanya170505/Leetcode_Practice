# Write your MySQL query statement below

with gp as(
    select *, Year(trans_date) as Y_ear, Month(trans_date) as M_onth
    from Transactions
)
select CONCAT(Y_ear,'-',LPAD(M_onth, 2, '0')) AS month, country, count(*) as trans_count, count(case when state='approved' then 1 end) as approved_count, sum(amount) trans_total_amount, sum(case when state='approved' then amount else 0 end) as approved_total_amount
from gp
group by country,Y_ear,M_onth;
