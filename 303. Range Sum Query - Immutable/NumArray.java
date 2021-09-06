// Runtime: 6 ms, faster than 100.00% of Java online submissions for Range Sum Query - Immutable.
// Memory Usage: 41.6 MB, less than 96.05% of Java online submissions for Range Sum Query - Immutable.

class NumArray {
    
    int[] sumArr;

    public NumArray(int[] nums) {
        sumArr = new int[nums.length];
        sumArr[0] = nums[0];
        
        for (int i = 1; i < nums.length; ++i) {
            sumArr[i] = sumArr[i-1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return left == 0 ? sumArr[right] : sumArr[right] - sumArr[left - 1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */