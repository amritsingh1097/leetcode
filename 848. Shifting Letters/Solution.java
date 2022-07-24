// Runtime: 15 ms, faster than 64.66% of Java online submissions for Shifting Letters.
// Memory Usage: 98.1 MB, less than 31.25% of Java online submissions for Shifting Letters.

class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        shifts[shifts.length - 1] %= 26;
        for (int i = shifts.length - 2; i >= 0; --i) {
            shifts[i] = (shifts[i] + shifts[i+1]) % 26;
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < shifts.length; ++i) {
            sb.append((char)((((s.charAt(i) - 'a') + shifts[i]) % 26) + 'a'));
        }
        
        return sb.toString();
    }
}
