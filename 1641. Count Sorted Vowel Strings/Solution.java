// Runtime: 0 ms, faster than 100.00% of Java online submissions for Count Sorted Vowel Strings.
// Memory Usage: 40.4 MB, less than 73.75% of Java online submissions for Count Sorted Vowel Strings.

class Solution {
    public int countVowelStrings(int n) {
        return ((n+1) * (n+2) * (n+3) * (n+4)) / 24;
    }
}
