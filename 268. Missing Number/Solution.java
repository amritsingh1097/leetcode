// Runtime: 1 ms, faster than 47.18% of Java online submissions for Missing Number.
// Memory Usage: 39 MB, less than 94.09% of Java online submissions for Missing Number.

class Solution {
    public int missingNumber(int[] nums) {
        return convertToNegative(nums);
        // return bitManipulation(nums);
        // return gaussFormula(nums);
    }
    
    // Convert nums[nums[i]] to negative and the index of positive integer will be the missing integer
    // If all are negative, then return length of the list.
    // Here, 0 is special case because we can't convert 0 to negative. Hence, the zeroNeg flag is there.
    public int convertToNegative(int[] nums) {
        boolean zeroNeg = false;
        
        for (int n : nums) {
            n = Math.abs(n);
            if (n < nums.length) {
                zeroNeg = (nums[n] == 0) || zeroNeg;
                nums[n] = -nums[n];
            }
        }
        
        for (int i = 0; i < nums.length; ++i) {
            if ((nums[i] == 0 && !zeroNeg) || nums[i] > 0)   return i;
        }
        
        return nums.length;
    }
    
    // Bit Manipulation Method
    public int bitManipulation(int nums[]) {
        int missing = nums.length;
        
        for (int i = 0; i < nums.length; ++i) {
            missing ^= i ^ nums[i];
        }
        
        return missing;
    }
    
    // Gauss Formula
    // Runtime: 0 ms, faster than 100.00% of Java online submissions for Missing Number.
    // Memory Usage: 38.9 MB, less than 97.64% of Java online submissions for Missing Number.
    public int gaussFormula(int[] nums) {
        int expectedSum = (nums.length * (nums.length + 1)) / 2;
        int actualSum = 0;
        
        for (int n : nums)  actualSum += n;
        
        return expectedSum - actualSum;
    }
    
}