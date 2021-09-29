// Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix II.
// Memory Usage: 37 MB, less than 84.49% of Java online submissions for Spiral Matrix II.

class Solution {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int count = 1;
        
        int[][] matrix = new int[n][n];
        while (left <= right && top <= bottom) {
            int i = left;
            while (i <= right)
                matrix[top][i++] = count++;
            
            i = ++top;
            while (i <= bottom)
                matrix[i++][right] = count++;
            
            if (top > bottom)
                break;
            
            i = --right;
            while (i >= left)
                matrix[bottom][i--] = count++;
            
            if (left > right)
                break;
            
            i = --bottom;
            while (i >= top)
                matrix[i--][left] = count++;
            
            ++left;
        }
        
        return matrix;
    }
}