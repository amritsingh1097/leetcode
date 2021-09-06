// Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
// Memory Usage: 37.1 MB, less than 98.75% of Java online submissions for Remove Element.

class Solution {
    public int removeElement(int[] nums, int val) {
        short ind = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != val) {
                nums[ind++] = nums[i];
            }
        }
        
        return ind;
    }
}