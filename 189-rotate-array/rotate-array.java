class Solution {
    public void rotate(int[] nums, int k) {

        int n=nums.length;

        k = k % n; 

        int temp[]=new int[k];

        int t2[]=new int[n-k];

        for(int i=0;i<n-k;i++){
            t2[i]=nums[i];
        }

        int id3=0;
        for(int i=n-k;i<n;i++){
            temp[id3++]=nums[i];
        }

        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }

        int id=0;
        for(int i=k;i<n;i++){
            nums[i]=t2[id++];
        }
        
    }
}