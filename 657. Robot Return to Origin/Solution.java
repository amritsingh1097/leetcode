// Runtime: 3 ms, faster than 98.68% of Java online submissions for Robot Return to Origin.
// Memory Usage: 38.5 MB, less than 99.60% of Java online submissions for Robot Return to Origin.

class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0;
        int u = 0;
        
        for (char c : moves.toCharArray()) {
            if (c == 'L')   ++l;
            else if (c == 'U')   ++u;
            else if (c == 'R')   --l;
            else if (c == 'D')   --u;
        }
        
        return (Math.abs(l) | Math.abs(u)) == 0;
    }
}