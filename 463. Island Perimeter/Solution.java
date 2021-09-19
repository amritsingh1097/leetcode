// Runtime: 5 ms, faster than 99.30% of Java online submissions for Island Perimeter.
// Memory Usage: 40.1 MB, less than 81.34% of Java online submissions for Island Perimeter.

class Solution {
    public int islandPerimeter(int[][] grid) {
        int p = 0;
        
        for (int r = 0; r < grid.length; ++r) {
            for (int c = 0; c < grid[0].length; ++c) {
                if (grid[r][c] == 1) {
                    p += 4;
                
                    if (r > 0 && grid[r-1][c] == 1)
                        p -= 2;

                    if (c > 0 && grid[r][c-1] == 1)
                        p -= 2;
                }
            }
        }
        
        // Uncomment below for DFS
        // for (int i = 0; i < grid.length; ++i) {
        //     for (int j = 0; j < grid[0].length; ++j) {
        //         if (grid[i][j] == 1) {
        //             grid[i][j] = 2;
        //             p = Math.max(dfs(grid, i, j), p);
        //         }
        //     }
        // }
        
        return p;
    }
    
    // DFS Approach
    // If the number of islands is greater than 1 than above approach won't work.
    // For that, we'll need to use DFS.
    // 
    // Runtime: 8 ms, faster than 44.48% of Java online submissions for Island Perimeter.
    // Memory Usage: 40.5 MB, less than 59.34% of Java online submissions for Island Perimeter.
    int dfs(int[][] grid, int r, int c) {
        int p = 0;
        
        if (r == 0) ++p;
        if (c == 0) ++p;
        if (r == grid.length - 1)   ++p;
        if (c == grid[0].length - 1)    ++p;
        
        if (r > 0) {
            if (grid[r-1][c] == 0) {
                ++p;
            } else if (grid[r-1][c] == 1) {
                grid[r-1][c] = 2;
                p += dfs(grid, r-1, c);
            }
        }
        
        if (r < grid.length - 1) {
            if (grid[r+1][c] == 0) {
                ++p;
            } else if (grid[r+1][c] == 1) {
                grid[r+1][c] = 2;
                p += dfs(grid, r+1, c);
            }
        }
        
        if (c > 0) {
            if (grid[r][c-1] == 0) {
                ++p;
            } else if (grid[r][c-1] == 1) {
                grid[r][c-1] = 2;
                p += dfs(grid, r, c-1);
            }
        }
        
        if (c < grid[0].length - 1) {
            if (grid[r][c+1] == 0) {
                ++p;
            } else if (grid[r][c+1] == 1) {
                grid[r][c+1] = 2;
                p += dfs(grid, r, c+1);
            }
        }
        
        return p;
    }
}