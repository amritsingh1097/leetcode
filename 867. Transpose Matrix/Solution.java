// Runtime: 0 ms, faster than 100.00% of Java online submissions for Transpose Matrix.
// Memory Usage: 39.5 MB, less than 96.41% of Java online submissions for Transpose Matrix.

class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int[][] mat = new int[matrix[0].length][matrix.length];
        
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                mat[j][i] = matrix[i][j];
            }
        }
        
        return mat;
    }
}