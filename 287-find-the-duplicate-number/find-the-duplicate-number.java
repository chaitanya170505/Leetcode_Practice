class Solution {
    public int findDuplicate(int[] arr) {


        int s=arr[0];

        int f=arr[0];

        while(true){

            s=arr[s];

            f=arr[arr[f]];

            if(s==f){
                break;
            }

        }


        s=arr[0];

        while(s!=f) {
            s=arr[s];
            f=arr[f];
        }

        return s;
        
        
        



    }
}