// Runtime: 0 ms, faster than 100.00% of Java online submissions for Game of Life.
// Memory Usage: 40.7 MB, less than 83.08% of Java online submissions for Game of Life.

class Solution {
    public void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                int liveCells = getLiveCells(board, i, j);
                // New States:
                // -1 for dead cell in next state
                // -2 for live cell in next state
                // 0 for dead in current and next state
                // 1 for live in current and next state
                if (board[i][j] == 1 && liveCells < 2) {
                    board[i][j] = -1;
                } else if (board[i][j] == 0 && liveCells == 3) {
                    board[i][j] = -2;
                } else if (board[i][j] == 1 && liveCells > 3) {
                    board[i][j] = -1;
                }
            }
        }
        
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == -1) {
                    board[i][j] = 0;
                } else if (board[i][j] == -2) {
                    board[i][j] = 1;
                }
            }
        }
    }
    
    public int getLiveCells(int[][] board, int i, int j) {
        int tl = (i > 0 && j > 0) ? Math.abs(board[i-1][j-1]) % 2 : 0;
        int t = (i > 0) ? Math.abs(board[i-1][j]) % 2 : 0;
        int tr = (i > 0 && j < board[0].length - 1) ? Math.abs(board[i-1][j+1]) % 2 : 0;
        int l = (j > 0) ? Math.abs(board[i][j-1]) % 2 : 0;
        int r = (j < board[0].length - 1) ? Math.abs(board[i][j+1]) % 2 : 0;
        int bl = (i < board.length - 1 && j > 0) ? Math.abs(board[i+1][j-1]) % 2 : 0;
        int b = (i < board.length - 1) ? Math.abs(board[i+1][j]) % 2 : 0;
        int br = (i < board.length - 1 && j < board[0].length - 1) ? Math.abs(board[i+1][j+1]) % 2 : 0;

        return (tl + t + tr + l + r + bl + b + br);
    }
}
