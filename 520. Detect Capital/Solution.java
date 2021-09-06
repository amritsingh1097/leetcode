// Runtime: 1 ms, faster than 99.28% of Java online submissions for Detect Capital.
// Memory Usage: 37.2 MB, less than 80.64% of Java online submissions for Detect Capital.


class Solution {
    public boolean detectCapitalUse(String word) {
        
        if (word.length() == 1) return true;
        
        boolean isUpper = Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1));
        
        for (char c : word.substring(1, word.length()).toCharArray()) {
            if (isUpper && Character.isLowerCase(c))   return false;
            if (!isUpper && Character.isUpperCase(c))  return false;
        }
        
        return true;
    }
}