// Runtime: 1 ms, faster than 100.00% of Java online submissions for Container With Most Water.
// Memory Usage: 52.5 MB, less than 91.48% of Java online submissions for Container With Most Water.

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = 0;
            int wall1 = height[left];
            int wall2 = height[right];
            if (wall1 < wall2) {
                area = (right - left) * wall1;
                while (left < right && height[++left] < wall1);
            } else {
                area = (right - left) * wall2;
                while (left < right && height[--right] < wall2);
            }
            
            if (area > maxArea) maxArea = area;
        }
        
        return maxArea;
    }
}
