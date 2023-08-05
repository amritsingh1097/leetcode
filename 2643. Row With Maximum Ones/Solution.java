class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];

        for (int i = 0; i < mat.length; ++i) {
            int ones = 0;
            for (int j = 0; j < mat[i].length; ++j) {
                ones += mat[i][j];
            }

            if (res[1] < ones) {
                res[0] = i;
                res[1] = ones;
            } else if (res[1] == ones && res[0] > i) {
                res[0] = i;
            }
        }

        return res;
    }
}
