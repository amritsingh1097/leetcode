// Runtime: 1 ms, faster than 96.72% of Java online submissions for Complex Number Multiplication.
// Memory Usage: 36.8 MB, less than 99.64% of Java online submissions for Complex Number Multiplication.

class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String[] s1 = num1.split("\\+");
        String[] s2 = num2.split("\\+");
        
        short real1 = Short.parseShort(s1[0]);
        short imag1 = Short.parseShort(s1[1].substring(0, s1[1].length()-1));
        short real2 = Short.parseShort(s2[0]);
        short imag2 = Short.parseShort(s2[1].substring(0, s2[1].length()-1));
        
        StringBuilder sb = new StringBuilder();
        sb.append((real1 * real2) + (imag1 * imag2 * -1));
        sb.append("+");
        sb.append((real1 * imag2) + (imag1 * real2));
        sb.append("i");
        
        return sb.toString();
    }
}