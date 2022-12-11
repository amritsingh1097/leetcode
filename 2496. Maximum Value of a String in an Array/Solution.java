class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String s : strs) {
            int tmp = 0;
            for (char ch : s.toCharArray()) {
                if (Character.isLetter(ch)) {
                    tmp = s.length();
                    break;
                }
                
                tmp = (tmp * 10) + (ch - '0');
            }

            if (max < tmp) max = tmp;
        }

        return max;
    }
}
