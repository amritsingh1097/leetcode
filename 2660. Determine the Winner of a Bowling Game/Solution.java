class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int lastStrike1 = player1[0] == 10 ? 0 : -10;
        int lastStrike2 = player2[0] == 10 ? 0 : -10;

        for (int i = 1; i < player1.length; ++i) {
            int mul = 1;
            if (i - lastStrike1 <= 2) mul = 2;

            if (player1[i] == 10) lastStrike1 = i;
            player1[i] = mul * player1[i] + player1[i - 1];

            mul = 1;
            if (i - lastStrike2 <= 2) mul = 2;
            
            if (player2[i] == 10) lastStrike2 = i;
            player2[i] = mul * player2[i] + player2[i - 1];
        }

        if (player1[player1.length - 1] < player2[player2.length - 1]) return 2;
        if (player1[player1.length - 1] > player2[player2.length - 1]) return 1;
        return 0;
    }
}
