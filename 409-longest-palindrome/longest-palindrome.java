class Solution {
    public int longestPalindrome(String s) {

        int arr[]=new int[128];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch]++;
        }

        boolean isO=false;

        int l=0;

        for(int i=0;i<arr.length;i++){
            l+=(arr[i]/2)*2;
            if(arr[i]%2!=0){
                isO=true;
            }
        }

        if(isO==true){
            return l+1;
        }
        
        return l;
        
    }
}