// Runtime: 1 ms, faster than 95.66% of Java online submissions for Perfect Number.
// Memory Usage: 35.9 MB, less than 45.88% of Java online submissions for Perfect Number.

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1)
            return false;
        
        int sum = 1;
        
        for (int i = 2; i <= num / i; ++i) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        
        return num == sum;
    }
}