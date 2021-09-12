// Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
// Memory Usage: 38.7 MB, less than 99.78% of Java online submissions for Find Smallest Letter Greater Than Target.

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1])
            return letters[0];
        
        int left = 0;
        int right = letters.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (target >= letters[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        
        return letters[left];
    }
}