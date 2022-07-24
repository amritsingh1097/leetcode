// Runtime: 2 ms, faster than 77.22% of Java online submissions for Two Sum II - Input Array Is Sorted.
// Memory Usage: 49.8 MB, less than 69.54% of Java online submissions for Two Sum II - Input Array Is Sorted.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        
        while (l < r) {
            if (numbers[l] + numbers[r] == target) return new int[] { l + 1, r  + 1 };
            
            if (numbers[l] + numbers[r] > target) --r;
            else ++l;
        }
        
        return null;
    }
}
