class Solution {
    public int maxPower(String s) {
        char last = s.charAt(0);
        int count = 0;
        int max = 0;

        for (int i = 0; i < s.length(); ++i) {
            if (last == s.charAt(i)) {
                ++count;

                if (max < count) max = count;
            } else {
                last = s.charAt(i);
                count = 1;
            }
        }

        return max;
    }
}
