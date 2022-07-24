// Runtime: 14 ms, faster than 85.62% of Java online submissions for Unique Email Addresses.
// Memory Usage: 45.6 MB, less than 81.22% of Java online submissions for Unique Email Addresses.

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            
            while (i < email.length()) {
                char c = email.charAt(i++);
                
                if (c == '@' || c == '+') break;
                if (c == '.') continue;
                
                sb.append(c);
            }
            
            if (email.charAt(i-1) == '+') {
                while (email.charAt(i++) != '@');
            }
            
            sb.append('@');
            
            while (i < email.length()) {
                char c = email.charAt(i++);
                
                if (c == '+') continue;
                
                sb.append(c);
            }
            
            set.add(sb.toString());
        }
        
        return set.size();
    }
}
