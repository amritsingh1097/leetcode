// Runtime: 667 ms, faster than 35.69% of Java online submissions for Implement strStr().
// Memory Usage: 39.1 MB, less than 55.69% of Java online submissions for Implement strStr().

class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.length() == 0)   return 0;
        if (haystack.length() == 0) return -1;
        
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        
        int i = 0;
        int hInd = 0;
        int j = 0;
        
        for (i=0; i<h.length; i++) {
            if (h[i] == n[j]) {
                j++;
            } else {
                i = hInd;
                hInd++;
                j = 0;
            }
            
            if (j == needle.length())   return hInd;
        }
        
        return -1;
    }
}