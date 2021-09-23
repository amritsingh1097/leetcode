// Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
// Memory Usage: 35.6 MB, less than 85.77% of Java online submissions for Fibonacci Number.

class Solution {
    public int fib(int n) {
        if(n == 0)
            return 0;
        
        int n1 = 0;
        int fib = 1;
        
        for (int i = 1; i < n; ++i) {
            fib += n1;
            n1 = fib - n1;
        }
        
        return fib;
    }
}