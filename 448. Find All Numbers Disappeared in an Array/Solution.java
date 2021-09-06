// Runtime: 5 ms, faster than 78.64% of Java online submissions for Find All Numbers Disappeared in an Array.
// Memory Usage: 47.7 MB, less than 84.26% of Java online submissions for Find All Numbers Disappeared in an Array.

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        
        for (int i = 0; i < nums.length; ++i) {
            int p = Math.abs(nums[i]) - 1;
            if (nums[p] > 0)    nums[p] *= -1;
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] > 0)    missing.add(i+1);
        }
        
        return missing;
    }
}