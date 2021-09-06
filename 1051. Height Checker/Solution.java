// Runtime: 1 ms, faster than 82.52% of Java online submissions for Height Checker.
// Memory Usage: 36.4 MB, less than 92.40% of Java online submissions for Height Checker.

class Solution {
    public int heightChecker(int[] heights) {
        int counter = 0;
        
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        for (int i = 0; i < heights.length; ++i) {
            if (heights[i] != expected[i])  ++counter;
        }
        
        return counter;
    }
}