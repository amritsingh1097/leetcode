// Runtime: 1 ms, faster than 63.23% of Java online submissions for Number of Steps to Reduce a Number to Zero.
// Memory Usage: 41 MB, less than 44.21% of Java online submissions for Number of Steps to Reduce a Number to Zero.

class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            num = num % 2 == 0 ? num / 2 : num - 1;
            ++steps;
        }
        
        return steps;
    }
}
