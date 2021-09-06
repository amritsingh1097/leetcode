// Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
// Memory Usage: 35.6 MB, less than 71.30% of Java online submissions for Guess Number Higher or Lower.

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        
        while (left <= right) {
            int pick = left + (right - left) / 2;
            
            int res = guess(pick);
            
            if (res == 0) return pick;
            
            if (res > 0)  left = pick + 1;
            else    right = pick - 1;
        }
        
        return left;
    }
}