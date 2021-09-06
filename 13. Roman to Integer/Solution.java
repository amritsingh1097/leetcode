// Runtime: 4 ms, faster than 75.49% of Java online submissions for Roman to Integer.
// Memory Usage: 39.6 MB, less than 29.63% of Java online submissions for Roman to Integer.

class Solution {
    public int romanToInt(String s) {
        
        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);
        
        int num = mp.get(s.charAt(s.length() - 1));
        
        for (int i = s.length() - 2; i >= 0; --i) {
            char ch = s.charAt(i);
            
            if (s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')) {
                num -= 1;
            } else if (s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C')) {
                num -= 10;
            } else if (s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')) {
                num -= 100;
            } else {
                num += mp.get(ch);
            }
        }
        
        return num;
        
    }
}