// Runtime: 0 ms, faster than 100.00% of Java online submissions for Check If It Is a Straight Line.
// Memory Usage: 38.2 MB, less than 97.16% of Java online submissions for Check If It Is a Straight Line.

class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2)
            return true;
        
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        
        for (int i = 2; i < coordinates.length; ++i) {
            int dx1 = coordinates[0][0] - coordinates[i][0];
            int dy1 = coordinates[0][1] - coordinates[i][1];
            
            if (dx * dy1 != dy * dx1)
                return false;
        }
        
        return true;
    }
}