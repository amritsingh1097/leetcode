// Runtime: 1 ms, faster than 95.22% of Java online submissions for Single Number.
// Memory Usage: 38.8 MB, less than 90.44% of Java online submissions for Single Number.

class Solution {
    public int singleNumber(int[] nums) {
        
        int num = 0;
        
        for (int i : nums)  num ^= i;
        
        return num;
    }
}