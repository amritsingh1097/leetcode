class Solution {
    public int maximumCount(int[] nums) {
        int count = 0;
        int i = 0;

        while (i < nums.length && nums[i] < 0) {
            ++count;
            ++i;
        }

        while (i < nums.length && nums[i] == 0) ++i;
        
        return nums.length - i > count ? nums.length - i : count;
    }
}
