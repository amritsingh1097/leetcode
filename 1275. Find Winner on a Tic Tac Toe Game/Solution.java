// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Winner on a Tic Tac Toe Game.
// Memory Usage: 36.5 MB, less than 78.65% of Java online submissions for Find Winner on a Tic Tac Toe Game.

class Solution {
    public String tictactoe(int[][] moves) {
        if (moves.length < 5)
            return "Pending";
        
        int size = 3;
        
        int[] row = new int[size];
        int[] col = new int[size];
        int diag = 0;
        int antiDiag = 0;
        
        int player = 1;
        
        for (int[] move : moves) {
            row[move[0]] += player;
            col[move[1]] += player;
            
            if (move[0] == move[1])
                diag += player;
            
            if (move[0] + move[1] == size - 1)
                antiDiag += player;
            
            if (Math.abs(row[move[0]]) == size
                || Math.abs(col[move[1]]) == size
                || Math.abs(diag) == size
                || Math.abs(antiDiag) == size)
                return (player == 1) ? "A" : "B";
            
            player *= -1;
        }
        
        return (moves.length == size * size) ? "Draw" : "Pending";
    }
}