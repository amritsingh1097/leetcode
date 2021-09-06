// Runtime: 1 ms, faster than 91.05% of Java online submissions for Decompress Run-Length Encoded List.
// Memory Usage: 39.6 MB, less than 65.08% of Java online submissions for Decompress Run-Length Encoded List.

class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        int ind = 0;
        
        // Calculate result array size
        for (int i = 0; i < nums.length; i += 2) {
            ind += nums[i];
        }
        
        int[] res = new int[ind];
        ind = 0;
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; ++j)
                res[ind++] = nums[i+1];
        }
        
        return res;
    }
}