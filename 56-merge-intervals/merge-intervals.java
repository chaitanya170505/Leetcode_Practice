class Solution {
    public int[][] merge(int[][] arr) {

        List<List<Integer>>ans=new ArrayList<>();

        Arrays.sort(arr,(a,b)->{
            return a[0]-b[0];
        });


        ans.add(Arrays.asList(arr[0][0],arr[0][1]));


        int n=arr.length;

        int idx=0;

        for(int i=1;i<n;i++){

            int a0=arr[i][0];
            int a1=arr[i][1];

            int c0=ans.get(idx).get(0);
            int c1=ans.get(idx).get(1);

            if(c0<=a0 && a0<=c1){
                ans.get(idx).set(1,Math.max(c1, a1));
            }
            else{
                ans.add(Arrays.asList(a0,a1));
                idx++;
            }

        }

        int res[][]=new int[ans.size()][2];

        for(int i=0;i<ans.size();i++){
            res[i][0]=ans.get(i).get(0);
            res[i][1]=ans.get(i).get(1);
        }

        return res;



        
    }
}