// Runtime: 6 ms, faster than 81.61% of Java online submissions for Shift 2D Grid.
// Memory Usage: 43.2 MB, less than 82.73% of Java online submissions for Shift 2D Grid.

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int size = rows * cols;
        List<List<Integer>> newGrid = new ArrayList<>();
        
        for (int i = 0; i < rows; ++i) {
            newGrid.add(new ArrayList<>());
        }
        
        k %= size;
        if (k == 0 || size == k) {
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < cols; ++j) {
                    newGrid.get(i).add(grid[i][j]);
                }
            }
            
            return newGrid;
        }
        
        int stRow = (size - k) / cols;
        int stCol = (size - k) - (stRow * cols);
        
        int i, j;
        int rowInd = 0;
        for (j = stCol; j < cols; ++j) {
            newGrid.get(rowInd).add(grid[stRow][j]);
        }
        
        for (i = stRow + 1; i < rows; ++i) {
            for (j = 0; j < cols; ++j) {
                if (newGrid.get(rowInd).size() == cols) ++rowInd;
                newGrid.get(rowInd).add(grid[i][j]);
            }
        }
        
        for (i = 0; i < stRow; ++i) {
            for (j = 0; j < cols; ++j) {
                if (newGrid.get(rowInd).size() == cols) ++rowInd;
                newGrid.get(rowInd).add(grid[i][j]);
            }
        }
        
        for (j = 0; j < stCol; ++j) {
            if (newGrid.get(rowInd).size() == cols) ++rowInd;
            newGrid.get(rowInd).add(grid[stRow][j]);
        }
        
        return newGrid;
    }
}
