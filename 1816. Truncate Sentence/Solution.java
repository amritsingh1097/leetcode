class Solution {
    public String truncateSentence(String s, int k) {
        int ind = 0;
        while (ind < s.length()) {
            if (k == 0) {
                --ind;
                break;
            }

            if (s.charAt(ind) == ' ') --k;

            ++ind;
        }

        return s.substring(0, ind);
    }
}
