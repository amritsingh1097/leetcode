class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int zeros = 0;
        int ones = 0;
        int max = 0;
        boolean pair = false;

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);

            if (ones >= zeros || (pair && ch == '0')) {
                zeros = 0;
                ones = 0;
            }

            if (ch == '0') ++zeros;
            else ++ones;

            if (ones <= zeros && max < ones) max = ones;
            
            pair = ch == '1';
        }

        return max * 2;
    }
}
