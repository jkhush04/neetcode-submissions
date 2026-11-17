

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];

        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

      
        int[] res2 = new int[hm.size()];
        int v = 0;
        for (int key : hm.keySet()) {
            res2[v++] = key;
        }

      
        for (int i = 0; i < res2.length - 1; i++) {
            for (int j = 0; j < res2.length - 1 - i; j++) {
                if (hm.get(res2[j]) > hm.get(res2[j + 1])) {
                    int temp = res2[j];
                    res2[j] = res2[j + 1];
                    res2[j + 1] = temp;
                }
            }
        }

       
        for (int i = 0; i < k; i++) {
            res[i] = res2[res2.length - 1 - i];
        }

        return res;
    }
}
