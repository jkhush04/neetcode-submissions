class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int lp=1;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
               res[i]=lp;
               lp*=nums[i];
        }
        int rp=1;
        for(int i=nums.length-1;i>=0;i--){
               res[i]*=rp;
               rp*=nums[i];
        }
        return res;
    }
}  
