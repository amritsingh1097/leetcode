// Runtime: 2 ms, faster than 91.87% of Java online submissions for Add Strings.
// Memory Usage: 38.9 MB, less than 83.76% of Java online submissions for Add Strings.

class Solution {
    public String addStrings(String num1, String num2) {
        
        int s1 = num1.length() - 1;
        int s2 = num2.length() - 1;
        
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        
        while (s1 >= 0 && s2 >= 0) {
            int sum = (n1[s1--] - '0') + (n2[s2--] - '0') + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }
        
        while (s1 >= 0) {
            int sum = (n1[s1--] - '0') + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }
        
        while (s2 >= 0) {
            int sum = (n2[s2--] - '0') + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }
        
        if (carry == 1) sb.append(1);
        
        return sb.reverse().toString();
    }
}