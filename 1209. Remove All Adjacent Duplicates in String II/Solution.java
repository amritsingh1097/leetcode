// Runtime: 183 ms, faster than 11.61% of Java online submissions for Remove All Adjacent Duplicates in String II.
// Memory Usage: 48.6 MB, less than 66.92% of Java online submissions for Remove All Adjacent Duplicates in String II.

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair<Character, Integer>> stack = new Stack<>();
        for (int i = 0; i < s.length(); ++i) {
            int count = (!stack.isEmpty() && stack.peek().getKey() == s.charAt(i)) ? stack.peek().getValue() + 1 : 1;
            
            if (count == k) {
                for (int j = 1; j < k; ++j) stack.pop();
            } else {
                stack.push(new Pair<>(s.charAt(i), count));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop().getKey());
        }
        
        return sb.toString();
    }
}
