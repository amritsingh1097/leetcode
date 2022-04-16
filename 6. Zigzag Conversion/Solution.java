// Runtime: 6 ms, faster than 79.74% of Java online submissions for Zigzag Conversion.
// Memory Usage: 42.6 MB, less than 93.49% of Java online submissions for Zigzag Conversion.

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; ++i) {
            list.add(new StringBuilder());
        }
        
        int counter = 0;
        int dir = 1;
        for (char ch : s.toCharArray()) {
            list.get(counter).append(ch);
            
            counter += dir;
            if (counter == 0 || counter == numRows - 1)
                dir *= -1;
        }
        
        StringBuilder sb = new StringBuilder();
        for (StringBuilder row : list) {
            sb.append(row);
        }
        
        return sb.toString();
    }
}
