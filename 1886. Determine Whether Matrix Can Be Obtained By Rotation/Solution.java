// Runtime: 0 ms, faster than 100.00% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.
// Memory Usage: 40.3 MB, less than 94.70% of Java online submissions for Determine Whether Matrix Can Be Obtained By Rotation.

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        return compareMatrix(mat, target)
            | compareMatrix(rotateMatrix(mat), target)
            | compareMatrix(rotateMatrix(mat), target)
            | compareMatrix(rotateMatrix(mat), target);
    }
    
    private int[][] rotateMatrix(int[][] matrix) {
        int size = matrix.length;
        int layers = size / 2;
        
        for (int i = 0; i < layers; ++i) {
            for (int j = i; j < size - i - 1; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[size - j - 1][i];
                matrix[size - j - 1][i] = matrix[size - i - 1][size - j - 1];
                matrix[size - i - 1][size - j - 1] = matrix[j][size - i - 1];
                matrix[j][size - i - 1] = tmp;
            }
        }
        
        return matrix;
    }
    
    private boolean compareMatrix(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; ++i) {
            for (int j = 0; j < mat.length; ++j) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
