// Runtime: 6 ms, faster than 41.38% of Java online submissions for Letter Combinations of a Phone Number.
// Memory Usage: 41.1 MB, less than 90.89% of Java online submissions for Letter Combinations of a Phone Number.

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();
        
        String[] arr = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        List<String> list = new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        q.add("");
        
        while (!q.isEmpty()) {
            String s = q.remove();
            
            if (s.length() == digits.length()) {
                list.add(s);
            } else {
                String letters = arr[digits.charAt(s.length()) - '2'];
                
                for (int i = 0; i < letters.length(); ++i) {
                    q.add(s + letters.charAt(i));
                }
            }
        }
        
        return list;
    }
}
