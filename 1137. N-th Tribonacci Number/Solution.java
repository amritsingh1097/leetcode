// Runtime: 0 ms, faster than 100.00% of Java online submissions for N-th Tribonacci Number.
// Memory Usage: 35.6 MB, less than 86.58% of Java online submissions for N-th Tribonacci Number.

class Solution {
    public int tribonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        
        int n1 = 0;
        int n2 = 1;
        int trib = 1;
        
        for (int i = 2; i < n; ++i) {
            trib += n1 + n2;
            n2 = trib - n2 - n1;
            n1 = trib - n2 - n1;
        }
        
        return trib;
    }
}