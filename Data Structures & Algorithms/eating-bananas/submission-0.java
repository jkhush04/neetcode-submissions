class Solution {
    public int minEatingSpeed(int[] piles, int h) {
         int left=1;
          int right=Arrays.stream(piles).max().getAsInt();
          int res=right;
          while(left<=right){
            int mid=(left+right)/2;
            long totaltime=0;
            for(int p:piles){
                 totaltime+=Math.ceil((double)p/mid);
            } 

            if(totaltime<=h){
                res=mid;
                right=mid-1;
            }
            else{
              left=mid+1;
            }
          }
    return res;
    }
}
