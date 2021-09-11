// Runtime: 2 ms, faster than 72.58% of Java online submissions for Lucky Numbers in a Matrix.
// Memory Usage: 39.1 MB, less than 97.01% of Java online submissions for Lucky Numbers in a Matrix.

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        Set<Integer> minSet = new HashSet<>();
        List<Integer> lucky = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; ++i) {
            int min = matrix[i][0];
            
            for (int j = 1; j < matrix[0].length; ++j) {
                if (min > matrix[i][j])
                    min = matrix[i][j];
            }
            
            minSet.add(min);
        }
        
        for (int j = 0; j < matrix[0].length; ++j) {
            int max = matrix[0][j];
            
            for (int i = 1; i < matrix.length; ++i) {
                if (max < matrix[i][j])
                    max = matrix[i][j];
            }
            
            if (minSet.contains(max)) {
                lucky.add(max);
            }
        }
        
        return lucky;
    }
}