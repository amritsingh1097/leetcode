// Runtime: 7 ms, faster than 88.60% of Java online submissions for Remove All Adjacent Duplicates In String.
// Memory Usage: 39.7 MB, less than 49.82% of Java online submissions for Remove All Adjacent Duplicates In String.

class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder sb = new StringBuilder();
        int l = 0;
        
        for (char c : s.toCharArray()) {
            if (l > 0 && sb.charAt(l-1) == c) {
                sb.setLength(--l);
            } else {
                sb.append(c);
                ++l;
            }
        }
        
        return sb.toString();
    }
}


// Runtime: 5 ms, faster than 91.39% of Java online submissions for Remove All Adjacent Duplicates In String.
// Memory Usage: 45.7 MB, less than 5.16% of Java online submissions for Remove All Adjacent Duplicates In String.

class Solution {
    public String removeDuplicates(String s) {
        
        char[] chArr = s.toCharArray();
        int size = 0;
        
        for (int i = 1; i < chArr.length; ++i) {
            if (size >= 0 && chArr[size] == chArr[i]) {
                --size;
            } else {
                chArr[++size] = chArr[i];
            }
        }
        
        return String.valueOf(chArr, 0, size+1);
    }
}