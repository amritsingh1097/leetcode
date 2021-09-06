// Runtime: 1 ms, faster than 99.58% of Java online submissions for Two Sum.
// Memory Usage: 39 MB, less than 75.30% of Java online submissions for Two Sum.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < nums.length; ++i) {
            if (mp.containsKey(nums[i])) {
                return new int[] { mp.get(nums[i]), i };
            }
            
            mp.put(target - nums[i], i);
        }
        
        return null;
    }
}