// Runtime: 0 ms, faster than 100.00% of Java online submissions for Student Attendance Record I.
// Memory Usage: 36.9 MB, less than 96.71% of Java online submissions for Student Attendance Record I.

class Solution {
    public boolean checkRecord(String s) {
        short absent = 0;
        short late = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                ++absent;
                late = 0;
            } else if (ch == 'L') {
                ++late;
            } else {
                late = 0;
            }
            
            if (absent >= 2) return false;
            if (late >= 3)  return false;
        }
        
        return true;
    }
}