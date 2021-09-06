// Runtime: 0 ms, faster than 100.00% of Java online submissions for Flood Fill.
// Memory Usage: 39.8 MB, less than 77.54% of Java online submissions for Flood Fill.

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int srcColor = image[sr][sc];
        image[sr][sc] = newColor;
        
        if (sr >= 1 && image[sr-1][sc] == srcColor && image[sr-1][sc] != newColor)
            image = floodFill(image, sr-1, sc, newColor);
        
        if (sc >= 1 && image[sr][sc-1] == srcColor && image[sr][sc-1] != newColor)
            image = floodFill(image, sr, sc-1, newColor);
        
        if (sr + 1 < image.length && image[sr+1][sc] == srcColor && image[sr+1][sc] != newColor)
            image = floodFill(image, sr+1, sc, newColor);
        
        if (sc + 1 < image[0].length && image[sr][sc+1] == srcColor && image[sr][sc+1] != newColor)
            image = floodFill(image, sr, sc+1, newColor);
        
        return image;
    }
}