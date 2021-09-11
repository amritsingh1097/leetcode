// Runtime: 1 ms, faster than 96.78% of Java online submissions for Shortest Distance to a Character.
// Memory Usage: 39 MB, less than 84.06% of Java online submissions for Shortest Distance to a Character.

class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr = new int[s.length()];
        
        int ind = -arr.length * 2;
        for (int i = 0; i < arr.length; ++i) {
            if (s.charAt(i) == c)
                ind = i;
            
            arr[i] = i - ind;
        }
        
        ind = arr.length * 2;
        for (int i = arr.length - 1; i >= 0; --i) {
            if (s.charAt(i) == c)
                ind = i;
            
            arr[i] = arr[i] <= (ind - i) ? arr[i] : ind - i;
        }
        
        return arr;
    }
}