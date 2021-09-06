// Runtime: 0 ms, faster than 100.00% of Java online submissions for Flipping an Image.
// Memory Usage: 39.1 MB, less than 77.15% of Java online submissions for Flipping an Image.

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int size = image.length;
        
        for (int row = 0; row < size; ++row) {
            for (int col = 0; col < (size+1) / 2; ++col) {
                int tmp = image[row][size - col - 1] ^ 1;
                image[row][size - col - 1] = image[row][col] ^ 1;
                image[row][col] = tmp;
            }
        }
        
        return image;
    }
}