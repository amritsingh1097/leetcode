// Runtime: 1 ms, faster than 100.00% of Java online submissions for Max Consecutive Ones.
// Memory Usage: 39.9 MB, less than 98.25% of Java online submissions for Max Consecutive Ones.

class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        
        for (int n : nums) {
            count += n;
            
            if (count > max)    max = count;
            
            if (n == 0) count = 0;
        }
        
        return max;
    }
}