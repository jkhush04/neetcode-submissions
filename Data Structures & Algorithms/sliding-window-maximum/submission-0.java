class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
           Queue<Integer> q=new LinkedList<>();
            ArrayList<Integer> res=new ArrayList<>();
          for(int i=0;i<nums.length;i++){
            if(q.size()==k){
                 res.add(Collections.max(q));
                q.poll();
            }
            q.offer(nums[i]);
          }
          if(!q.isEmpty()){
            res.add(Collections.max(q));
          }

    return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
