// Runtime: 0 ms, faster than 100.00% of Java online submissions for Defanging an IP Address.
// Memory Usage: 36.8 MB, less than 92.82% of Java online submissions for Defanging an IP Address.

class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        
        for (char ch : address.toCharArray()) {
            if (ch == '.')
                sb.append("[.]");
            else
                sb.append(ch);
        }
        
        return sb.toString();
    }
}