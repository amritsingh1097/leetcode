// Runtime: 2 ms, faster than 85.31% of Java online submissions for Squares of a Sorted Array.
// Memory Usage: 54.9 MB, less than 79.58% of Java online submissions for Squares of a Sorted Array.

class Solution {
    public int[] sortedSquares(int[] nums) {
        int neg = -1;
        for (int i = 0; i < nums.length && nums[i] < 0; ++i) {
            ++neg;
        }
        
        int[] sq = new int[nums.length];
        int pos = neg + 1;
        int sqInd = 0;
        while (neg >= 0 && pos < nums.length) {
            if (-nums[neg] < nums[pos]) {
                sq[sqInd] = nums[neg] * nums[neg];
                --neg;
            } else {
                sq[sqInd] = nums[pos] * nums[pos];
                ++pos;
            }
            
            ++sqInd;
        }
        
        while (neg >= 0) {
            sq[sqInd] = nums[neg] * nums[neg];
            --neg;
            ++sqInd;
        }
        
        while (pos < nums.length) {
            sq[sqInd] = nums[pos] * nums[pos];
            ++pos;
            ++sqInd;
        }
        
        return sq;
    }
}
