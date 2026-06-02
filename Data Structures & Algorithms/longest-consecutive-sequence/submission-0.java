class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        
        for(int n: nums){
            hs.add(n);
        }
        int maxlen=0;
        
        for(int num:hs){
            
           if(!hs.contains(num-1)){
             int currnum=num;
             int count=1;
             while(hs.contains(currnum+1)){
                currnum++;
                count++;
             }

             maxlen=Math.max(maxlen,count);
           }
        }

        return maxlen;
    }
}
