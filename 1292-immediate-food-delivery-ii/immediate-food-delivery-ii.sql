# Write your MySQL query statement below


with gp as(

    select *, row_number() over(partition by customer_id order by order_date asc) as rk
    from Delivery

)

select round(100*(select count(case when order_date=customer_pref_delivery_date then 1 end) from gp where rk=1)/count(*),2) as immediate_percentage
from gp
where rk=1;