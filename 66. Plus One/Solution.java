// Runtime: 0 ms, faster than 100.00% of Java online submissions for Plus One.
// Memory Usage: 37.5 MB, less than 66.98% of Java online submissions for Plus One.

class Solution {
    public int[] plusOne(int[] digits) {
        boolean carry = true;
        
        int i=0;
        for (i = digits.length-1; i >= 0; --i) {
            if (!carry) break;
            
            carry = ((digits[i] + 1) / 10) == 1;
            
            digits[i] = (digits[i] + 1) % 10;
        }
        
        if (carry) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = 1;
            
            for (i = 1; i < tmp.length; ++i) {
                tmp[i] = digits[i - 1];
            }
            
            return tmp;
        }
        
        return digits;
    }
}