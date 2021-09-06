// Runtime: 1 ms, faster than 99.04% of Java online submissions for Sort Array By Parity.
// Memory Usage: 39.3 MB, less than 97.94% of Java online submissions for Sort Array By Parity.

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int even = 0;
        int odd = nums.length - 1;
        
        int[] list = new int[nums.length];
        
        for (int n : nums) {
            if (n % 2 == 0) {
                list[even++] = n;
            } else {
                list[odd--] = n;
            }
        }
        
        return list;
    }
}