class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {

        Arrays.sort(arr);

        int n=arr.length;

        int mini=Integer.MAX_VALUE;

        for(int i=0;i<n-1;i++){
            int diff=arr[i+1]-arr[i];
            if(mini>diff){
                mini=diff;
            }
        }


        List<List<Integer>>ans=new ArrayList<>();


        for(int i=0;i<n-1;i++){
            int complement=arr[i+1]-arr[i];

            if(complement==mini){
                ans.add(Arrays.asList(arr[i],arr[i+1]));
            }
            
        }

        return ans;

        
    }
}