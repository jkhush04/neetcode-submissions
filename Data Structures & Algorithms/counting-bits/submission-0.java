class Solution {
    public int[] countBits(int n) {
       
        int ans[]=new int[n+1];
      
  
      while(n>0){
        int i=n;
            while(i!=0){
                ans[n]++;
                i &=(i-1);
            }
            n--;
      }
      return ans;
    }
}
