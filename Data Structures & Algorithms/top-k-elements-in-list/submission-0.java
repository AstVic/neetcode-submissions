class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            seen.put(nums[i], seen.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] freqs = new List[nums.length + 1];
        for (int key: seen.keySet()) {
            int freq = seen.get(key);
            if (freqs[freq] == null) {
                freqs[freq] = new ArrayList<>();
            }
            freqs[freq].add(key);
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = freqs.length - 1; i >= 0; i--) {
            if (freqs[i] != null) {
                for (int num: freqs[i]) {
                    if (index == k) break;
                    res[index] = num;
                    index++;
                }
            }
        }
        return res;
    }
}
