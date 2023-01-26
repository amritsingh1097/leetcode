class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int sum1 = 0;
        int sum2 = 0;
        int target = 0;
        
        for (int i = 0; i < firstWord.length(); ++i) {
            sum1 = (sum1 * 10) + (firstWord.charAt(i) - 'a');
        }
        for (int i = 0; i < secondWord.length(); ++i) {
            sum2 = (sum2 * 10) + (secondWord.charAt(i) - 'a');
        }
        for (int i = 0; i < targetWord.length(); ++i) {
            target = (target * 10) + (targetWord.charAt(i) - 'a');
        }

        return sum1 + sum2 == target;
    }
}
