class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
      
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
            hm.put(nums[i],hm.get(nums[i])+1);
        }else{
            hm.put(nums[i],1);
        }
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
          arr.add(new int[] {e.getValue(), e.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);
        
         int res[]=new int[k];
         for(int j=0;j<res.length;j++){
            res[j]=arr.get(j)[1];
         }

    return res;    
        
    }
}
