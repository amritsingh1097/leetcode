class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int rSum = 0;
        int lSum = 0;
        for (int n : nums) rSum += n;

        for (int i = 0; i < nums.length; ++i) {
            int t = nums[i];
            rSum -= t;
            nums[i] = Math.abs(rSum - lSum);
            lSum += t;
        }

        return nums;
    }
}
