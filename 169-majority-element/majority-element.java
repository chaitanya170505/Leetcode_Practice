class Solution {
    public int majorityElement(int[] arr) {

        int vote=0;
        int voteEl=arr[0];

        for(int i=0;i<arr.length;i++){
            if(vote==0){
                voteEl=arr[i];
            }
            if(arr[i]!=voteEl){
                vote--;
            }
            else{
                vote++;
            }
        }

        int c=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==voteEl){
                c++;
            }
        }

        int n=arr.length;

        if(c>n/2){
            return voteEl;
        }

        return -1;
        
    }
}