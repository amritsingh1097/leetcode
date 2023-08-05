class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];

        for (int i = 0; i < grid[0].length; ++i) {
            for (int j = 0; j < grid.length; ++j) {
                int n = grid[j][i];
                int c = 0;

                if (n <= 0) c = 1;

                while (n != 0) {
                    ++c;
                    n /= 10;
                }

                if (res[i] < c) res[i] = c;
            }
        }

        return res;
    }
}
