// Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
// Memory Usage: 40.9 MB, less than 90.08% of Java online submissions for Rotate Image.

class Solution {
    public void rotate(int[][] matrix) {
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
    }
}
