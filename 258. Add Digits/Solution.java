// Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Digits.
// Memory Usage: 35.7 MB, less than 98.70% of Java online submissions for Add Digits.

class Solution {
    public int addDigits(int num) {
        
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
            
            if (num == 0 && sum > 9) {
                num = sum;
                sum = 0;
            }
        }
        
        return sum;
    }
}


// Implementation 2 - Digital root

class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + ((num - 1) % 9);
    }
}