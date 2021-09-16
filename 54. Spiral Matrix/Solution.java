// Runtime: 0 ms, faster than 100.00% of Java online submissions for Spiral Matrix.
// Memory Usage: 37 MB, less than 79.48% of Java online submissions for Spiral Matrix.

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        
        List<Integer> l = new ArrayList<>();
        while (left <= right && top <= bottom) {
            int i = left;
            while (i <= right)
                l.add(matrix[top][i++]);
            
            i = ++top;
            while (i <= bottom)
                l.add(matrix[i++][right]);
            
            if (top > bottom)
                break;
            
            i = --right;
            while (i >= left)
                l.add(matrix[bottom][i--]);
            
            if (left > right)
                break;
            
            i = --bottom;
            while (i >= top)
                l.add(matrix[i--][left]);
            
            ++left;
        }
        
        return l;
    }
}