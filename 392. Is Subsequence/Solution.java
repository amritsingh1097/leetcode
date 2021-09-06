// Runtime: 1 ms, faster than 78.84% of Java online submissions for Is Subsequence.
// Memory Usage: 36.7 MB, less than 88.16% of Java online submissions for Is Subsequence.

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() > t.length())    return false;
        
        int i = 0;
        for (char c : t.toCharArray()) {
            if (i == s.length())    break;
            else if (s.charAt(i) == c)   ++i;
        }
        
        return i == s.length();
    }
}

// 2 Pointer approach
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Is Subsequence.
// Memory Usage: 36.7 MB, less than 94.63% of Java online submissions for Is Subsequence.

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if (s.length() > t.length())    return false;
        
        int sl = 0;
        int sr = s.length() - 1;
        int tl = 0;
        int tr = t.length() - 1;
        
        while (sl <= sr && tl <= tr) {
            if (s.charAt(sl) == t.charAt(tl++))  sl++;
            if (s.charAt(sr) == t.charAt(tr--))  sr--;
        }
        
        if (sl > sr)    return true;
        
        if (sl == sr && tl >= tr)   return false;
        
        return false;
    }
}