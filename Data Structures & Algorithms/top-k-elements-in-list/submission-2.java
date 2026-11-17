class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }


        List<Integer>[] buckets = new List[nums.length + 1];
        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            int freq = e.getValue();
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(e.getKey());
        }

        
        int[] res = new int[k];
        int index = 0;
        for (int freq = buckets.length - 1; freq >= 0 && index < k; freq--) {
            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    res[index++] = num;
                    if (index == k) break;
                }
            }
        }
        
        return res;
    }
}

