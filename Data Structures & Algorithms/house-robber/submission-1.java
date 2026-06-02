class Solution {
    private int[]res;
    public int rob(int[] nums) {
  res=new int[nums.length];
  Arrays.fill(res,-1);
        return dfs(nums, 0);
    }

    public int dfs(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(res[i]!=-1){
            return res[i];
        }
    res[i] = Math.max(dfs(nums, i + 1),
                         nums[i] + dfs(nums, i + 2));
        return res[i];
    }
}
