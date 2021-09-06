// Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse Integer.
// Memory Usage: 35.8 MB, less than 95.78% of Java online submissions for Reverse Integer.

class Solution {
    public int reverse(int x) {
        int num = 0;
        
        while(x != 0) {
            int tmp = x % 10;
            x /= 10;
            
            if (num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && tmp > 7)) return 0;
            if (num < Integer.MIN_VALUE/10 || (num == Integer.MIN_VALUE/10 && tmp < -8)) return 0;
            
            num = num * 10 + tmp;
        }
        
        return num;
    }
}