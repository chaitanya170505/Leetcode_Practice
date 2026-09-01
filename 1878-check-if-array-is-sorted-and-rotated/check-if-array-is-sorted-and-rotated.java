class Solution {
    public boolean check(int[] arr) {

        int n=arr.length;

        int k=0;

        for(int i=0;i<n-1;i++){
            if(arr[i+1]<arr[i]){
                k=i+1;
                break;
            }
        }

        if(k==0){
            return true;
        }

        for(int i=k;i<n;i++){
            if(arr[i%n]>arr[(i+1)%n]){
                return false;
            }
        }

        return true;


    }
}