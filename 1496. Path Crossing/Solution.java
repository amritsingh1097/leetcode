// Runtime: 1 ms, faster than 99.53% of Java online submissions for Path Crossing.
// Memory Usage: 41 MB, less than 91.61% of Java online submissions for Path Crossing.

class Solution {
    class Point {
        int x;
        int y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        
        @Override
        public boolean equals(Object o) {
            return (this == o || (this.x == ((Point) o).x && this.y == ((Point) o).y));
        }
        
        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
    
    public boolean isPathCrossing(String path) {
        Set<Point> s = new HashSet<>();
        int x = 0;
        int y = 0;
        s.add(new Point(x, y));
        
        for (char ch : path.toCharArray()) {
            if (ch == 'N')
                ++y;
            else if (ch == 'E')
                ++x;
            else if (ch == 'W')
                --x;
            else
                --y;
            
            Point p = new Point(x, y);
            if (s.contains(p))
                return true;
            
            s.add(p);
        }
        
        return false;
    }
}
