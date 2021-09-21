// Runtime: 0 ms, faster than 100.00% of Java online submissions for Happy Number.
// Memory Usage: 35.3 MB, less than 99.64% of Java online submissions for Happy Number.

class Solution {
    public boolean isHappy(int n) {
        int fast = getNext(n);
        while (fast != 1 && n != fast) {
            n = getNext(n);
            fast = getNext(getNext(fast));
        }
        
        return fast == 1;
    }
    
    public int getNext(int n) {
        int sum = 0;
        
        while (n > 0) {
            int mod = n % 10;
            n /= 10;
            sum += mod * mod;
        }
        
        return sum;
    }
}