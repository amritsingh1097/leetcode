class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int minInd = 0;
        int maxInd = 0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 1) minInd = i;
            if (nums[i] == nums.length) maxInd = i;
        }

        if (maxInd < minInd) ++maxInd;

        return (nums.length - maxInd) + minInd - 1;
    }
}
