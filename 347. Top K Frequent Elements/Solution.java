// Runtime: 8 ms, faster than 97.76% of Java online submissions for Top K Frequent Elements.
// Memory Usage: 45.2 MB, less than 82.09% of Java online submissions for Top K Frequent Elements.

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] kFreq = new int[k];
        
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        
        int numLength = nums.length;
        List<Integer>[] buckets = new List[numLength];
        mp.forEach((num, freq) -> {
            int ind = numLength - freq;
            if (buckets[ind] == null)  buckets[ind] = new ArrayList<>();
            
            buckets[ind].add(num);
        });
        
        int ind = 0;
        for (List<Integer> bucket : buckets) {
            if (bucket != null) {
                for (int n : bucket) {
                    kFreq[ind++] = n;
                    if (ind == k)   return kFreq;
                }
            }
        }
        
        return kFreq;
    }
}
