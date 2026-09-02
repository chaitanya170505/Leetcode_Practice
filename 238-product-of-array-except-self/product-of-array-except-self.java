class Solution {
    public int[] productExceptSelf(int[] arr) {


        int n=arr.length;

        int p=1;

        boolean is0=false;

        boolean more0=false;

        for(int i=0;i<n;i++){
            if(is0==true && arr[i]==0){
                more0=true;
            }
            if(arr[i]==0){
                is0=true;
            }
            else{
                p=p*arr[i];
            }
        }

        int p0=0;

        for(int i=0;i<n;i++){

            if(is0==true){
                if(arr[i]!=0){
                    arr[i]=0;
                }
                else{
                    if(more0==true){
                        arr[i]=0;
                    }
                    else{
                        arr[i]=p;
                    }
                }
            }
            else{
                arr[i]=p/arr[i];
            }

        }

        return arr;
        
        
    }
}