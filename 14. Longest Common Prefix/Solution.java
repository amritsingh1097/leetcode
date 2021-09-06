// Runtime: 1 ms, faster than 58.76% of Java online submissions for Longest Common Prefix.
// Memory Usage: 36.8 MB, less than 90.19% of Java online submissions for Longest Common Prefix.

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String matcher = strs[0];
        
        // Horizontal Scanning
        // for (int i = 1; i < strs.length; ++i) {
        //     for (int ind = 0; ind < strs[i].length(); ++ind) {
        //         if (ind < matcher.length() && matcher.charAt(ind) != strs[i].charAt(ind)) {
        //             matcher = matcher.substring(0, ind);
        //             break;
        //         }
        //     }
        //     if (matcher.length() > strs[i].length()) matcher = strs[i];
        // }
        
        // Vertical Scanning
        for (int ind = 0; ind < strs[0].length(); ++ind) {
            for (int i = 0; i<strs.length; ++i) {
                if (ind == strs[i].length() || strs[i].charAt(ind) != strs[0].charAt(ind)) {
                    return strs[0].substring(0, ind);
                }
            }
        }
        
        return strs[0];
    }
}