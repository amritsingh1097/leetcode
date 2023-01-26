class Solution {
    public boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; ++i) {
            if (grid[i][i] == 0 || grid[i][grid.length - i - 1] == 0) return false;

            for (int j = 0; j < grid.length; ++j) {
                if (i != j && i != grid.length - j - 1 && grid[i][j] != 0) return false;
            }
        }

        return true;
    }
}
