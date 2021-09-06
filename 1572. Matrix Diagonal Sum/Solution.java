// Runtime: 0 ms, faster than 100.00% of Java online submissions for Matrix Diagonal Sum.
// Memory Usage: 38.9 MB, less than 70.70% of Java online submissions for Matrix Diagonal Sum.

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        
        for (int i = 0; i < mat.length; ++i) {
            sum += mat[i][i];
            sum += mat[i][mat.length - i - 1];
        }
        
        if (mat.length % 2 != 0)
            sum -= mat[mat.length / 2][mat.length / 2];
        
        return sum;
    }
}