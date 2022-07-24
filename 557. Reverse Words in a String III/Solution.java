// Runtime: 8 ms, faster than 72.24% of Java online submissions for Reverse Words in a String III.
// Memory Usage: 43.1 MB, less than 87.26% of Java online submissions for Reverse Words in a String III.

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (String str : s.split(" ")) {
            for (int i = str.length() - 1; i >= 0; --i) {
                sb.append(str.charAt(i));
            }
            sb.append(" ");
        }
        
        return sb.substring(0, sb.length() - 1);
        
//         for (int i = 0 ; i < s.length(); ++i) {
//             int j = i;
//             while (j < s.length() && s.charAt(j) != ' ') sb.insert(i, s.charAt(j++));
//             sb.append(" ");
            
//             i = j;
//         }
        
//         return sb.substring(0, sb.length() - 1);
        
//         for (int i = 0 ; i < s.length(); ++i) {
//             int j = i;
//             while (j < s.length() && s.charAt(j) != ' ') ++j;
            
//             int tmp = j - 1;
            
//             while (tmp >= i) sb.append(s.charAt(tmp--));
            
//             if (j < s.length()) sb.append(" ");
            
//             i = j;
//         }
        
//         return sb.toString();
    }
}
