// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reshape the Matrix.
// Memory Usage: 39.9 MB, less than 66.65% of Java online submissions for Reshape the Matrix.

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat.length == 0 ? 0 : mat[0].length;
        int matCells = m * n;
        int cells = r * c;
        
        int[][] newMat;
        if (cells >= matCells && (matCells % r) == 0) {
            
            int p = 0, q = 0;
            newMat = new int[r][matCells/r];
            
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    if (q == (matCells / r)) {
                        q = 0;
                        p++;
                    }
                    
                    newMat[p][q++] = mat[i][j];
                }
            }
            
            return newMat;
        }
        
        return mat;
    }
}