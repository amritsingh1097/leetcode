// Runtime: 0 ms, faster than 100.00% of Java online submissions for Number Complement.
// Memory Usage: 35.5 MB, less than 91.65% of Java online submissions for Number Complement.

class Solution {
    public int findComplement(int num) {
        int ans = 0;
        int i = 1;
        while (num > 0) {
            int n = (num & 1) == 1 ? 0 : 1;
            num >>= 1;
            ans += n * i;
            i *= 2;
        }
        
        return ans;
    }
}