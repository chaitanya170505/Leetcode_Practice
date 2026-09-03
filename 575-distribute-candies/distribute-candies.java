class Solution {
    public int distributeCandies(int[] arr) {

        int n=arr.length;

        int half=n/2;

        HashSet<Integer>hs=new HashSet<>();

        for(int a:arr){
            hs.add(a);
        }


        int u=hs.size();


        return Math.min(u,half);

        
        
    }
}