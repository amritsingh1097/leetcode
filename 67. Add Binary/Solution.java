// Runtime: 1 ms, faster than 100.00% of Java online submissions for Add Binary.
// Memory Usage: 38.7 MB, less than 70.23% of Java online submissions for Add Binary.

class Solution {
    public String addBinary(String a, String b) {
        
        int aSize = a.length()-1;
        int bSize = b.length()-1;
        int carry = 0;
        
        StringBuilder sb = new StringBuilder();
        
        while (aSize >= 0 || bSize >= 0) {
            
            int ca = (aSize >= 0) ? a.charAt(aSize)-'0' : 0;
            int cb = (bSize >= 0) ? b.charAt(bSize)-'0' : 0;
            
            sb.append(ca ^ cb ^ carry);
            
            carry = (carry & (ca | cb)) | (ca & cb);
            
            aSize--;
            bSize--;
        }
        
        if (carry == 1) sb.append(1);
        
        return sb.reverse().toString();
    }
}

class Solution {
    public String addBinary(String a, String b) {
        
        int aSize = a.length() - 1;
        int bSize = b.length() - 1;
        int sum = 0;
        
        String newStr = "";
        
        while (aSize >= 0 || bSize >= 0 || sum == 1) {
            
            sum += (aSize >= 0) ? a.charAt(aSize)-'0' : 0;
            sum += (bSize >= 0) ? b.charAt(bSize)-'0' : 0;
            
            newStr = (char)(sum % 2 + '0') + newStr;
            
            sum /= 2;
            
            aSize--;
            bSize--;
        }
        
        return newStr;
    }
}

class Solution {
    public String addBinary(String a, String b) {
        
        int aSize = 0;
        int bSize = 0;
        
        String newStr = "";
        char carry = '0';
        char sum = '0';
        for (aSize=a.length()-1, bSize=b.length()-1; aSize >= 0 && bSize >= 0; aSize--, bSize--) {
            sum = (char)(((carry-'0') + (a.charAt(aSize)-'0') + (b.charAt(bSize)-'0')) + '0');
            if (sum == '3') {
                carry = '1';
                newStr = '1' + newStr;
            } else if (sum == '2') {
                carry = '1';
                newStr = '0' + newStr;
            } else {
                carry = '0';
                newStr = sum + newStr;
            }
        }
        
        while (aSize >= 0) {
            sum = (char)(((carry-'0') + (a.charAt(aSize) - '0')) + '0');
            if (sum == '2') {
                carry = '1';
                newStr = '0' + newStr;
            } else {
                carry = '0';
                newStr = sum + newStr;
            }
            aSize--;
        }
        
        while (bSize >= 0) {
            sum = (char)(((carry-'0') + (b.charAt(bSize)-'0')) + '0');
            if (sum == '2') {
                carry = '1';
                newStr = '0' + newStr;
            } else {
                carry = '0';
                newStr = sum + newStr;
            }
            bSize--;
        }
        
        if (carry == '1') newStr = '1' + newStr;
        
        return newStr;
    }
}

class Solution {
    public String addBinary(String a, String b) {
        
        int aSize = 0;
        int bSize = 0;
        
        String newStr = "";
        char carry = '0';
        char ca = '0';
        char cb = '0';
        char ch = '0';
        for (aSize=a.length()-1, bSize=b.length()-1; aSize >= 0 && bSize >= 0; aSize--, bSize--) {
            ca = a.charAt(aSize);
            cb = b.charAt(bSize);
            
            if (carry == '1' && ca == '1' && cb == '1') {
                carry = '1';
                ch = '1';
            } else if ((carry == '0' && ca == '1' && cb == '1')
                      || (carry == '1' && ca != cb)) {
                carry = '1';
                ch = '0';
            } else if ((carry == '1' && ca == '0' && cb == '0')
                      || (carry == '0' && ca != cb)) {
                carry = '0';
                ch = '1';
            } else {
                carry = '0';
                ch = '0';
            }
            
            newStr = ch + newStr;
        }
        
        while (aSize >= 0) {
            ca = a.charAt(aSize);
            
            if (carry != ca) {
                carry = '0';
                ch = '1';
            } else if (carry == '1' && ca == '1') {
                carry = '1';
                ch = '0';
            } else {
                carry = '0';
                ch = '0';
            }
            
            newStr = ch + newStr;
            aSize--;
        }
        
        while (bSize >= 0) {
            cb = b.charAt(bSize);
            
            if (carry != cb) {
                carry = '0';
                ch = '1';
            } else if (carry == '1' && cb == '1') {
                carry = '1';
                ch = '0';
            } else {
                carry = '0';
                ch = '0';
            }
            
            newStr = ch + newStr;
            bSize--;
        }
        
        if (carry == '1') newStr = '1' + newStr;
        
        return newStr;
    }
}