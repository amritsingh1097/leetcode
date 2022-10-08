// Runtime: 0 ms, faster than 100.00% of Java online submissions for Defuse the Bomb.
// Memory Usage: 42.1 MB, less than 91.57% of Java online submissions for Defuse the Bomb.

class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] res = new int[code.length];
        
        int left = 1;
        int right = k + 1;
        int sum = 0;
        
        if (k < 0) {
            left = code.length + k;
            right = code.length;
        }
        
        for (int i = left; i < right; ++i) sum += code[i];
        
        for (int i = 0; i < code.length; ++i, ++left, ++right) {
            res[i] = sum;
            sum = sum - code[left % code.length] + code[right % code.length];
        }
        
        return res;
    }
}
