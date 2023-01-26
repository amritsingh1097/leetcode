class Solution {
    public int countAsterisks(String s) {
        boolean pair = true;
        int count = 0;

        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (ch == '|') pair = !pair;

            if (pair && ch == '*') ++count;
        }

        return count;
    }
}
