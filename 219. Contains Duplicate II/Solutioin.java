// Runtime: 18 ms, faster than 59.11% of Java online submissions for Contains Duplicate II.
// Memory Usage: 47.5 MB, less than 90.99% of Java online submissions for Contains Duplicate II.

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < nums.length; ++i) {
            if (mp.containsKey(nums[i]))
                if (i - mp.get(nums[i]) <= k)
                    return true;
            
            mp.put(nums[i], i);
        }
        
        return false;
    }
}