// Runtime: 10 ms, faster than 96.32% of Java online submissions for Array Partition I.
// Memory Usage: 40.7 MB, less than 91.38% of Java online submissions for Array Partition I.


class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        
        return sum;
    }
}