class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1[1], p2[1]));

        int last = 0;
        int arrows = 1;
        for (int i = 1; i < points.length; ++i) {
            if (points[i][0] > points[last][1]) {
                ++arrows;
                last = i;
            }
        }

        return arrows;
    }
}
