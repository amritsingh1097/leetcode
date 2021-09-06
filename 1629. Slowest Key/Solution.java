// Runtime: 1 ms, faster than 74.69% of Java online submissions for Slowest Key.
// Memory Usage: 39.1 MB, less than 60.07% of Java online submissions for Slowest Key.

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        
        for (int i = 1; i < keysPressed.length(); ++i) {
            char ch = keysPressed.charAt(i);
            int currDuration = releaseTimes[i] - releaseTimes[i - 1];
            
            if (maxDuration <= currDuration) {
                if (maxDuration < currDuration || slowestKey < ch)
                    slowestKey = ch;
                
                maxDuration = currDuration;
            }
        }
        
        return slowestKey;
    }
}