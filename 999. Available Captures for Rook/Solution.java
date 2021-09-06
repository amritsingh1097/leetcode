// Runtime: 0 ms, faster than 100.00% of Java online submissions for Available Captures for Rook.
// Memory Usage: 36.4 MB, less than 65.85% of Java online submissions for Available Captures for Rook.

class Solution {
    public int numRookCaptures(char[][] board) {
        int n = 0;
        int rookI = 0;
        int rookJ = 0;
        
        for (int i = 0; i < board.length; ++i) {
            for (int j = 0; j < board[0].length; ++j) {
                if (board[i][j] == 'R') {
                    rookI = i;
                    rookJ = j;
                    break;
                }
            }
        }
        
        for (int j = rookJ - 1; j >= 0; --j) {
            if (board[rookI][j] == 'B')
                break;
            else if (board[rookI][j] == 'p') {
                ++n;
                break;
            }
        }
        
        for (int j = rookJ + 1; j < board[0].length; ++j) {
            if (board[rookI][j] == 'B')
                break;
            else if (board[rookI][j] == 'p') {
                ++n;
                break;
            }
        }
        
        for (int i = rookI - 1; i >= 0; --i) {
            if (board[i][rookJ] == 'B')
                break;
            else if (board[i][rookJ] == 'p') {
                ++n;
                break;
            }
        }
        
        for (int i = rookI + 1; i < board.length; ++i) {
            if (board[i][rookJ] == 'B')
                break;
            else if (board[i][rookJ] == 'p') {
                ++n;
                break;
            }
        }
        
        return n;
    }
}