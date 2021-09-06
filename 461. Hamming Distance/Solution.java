// Runtime: 0 ms, faster than 100.00% of Java online submissions for Hamming Distance.
// Memory Usage: 35.7 MB, less than 67.04% of Java online submissions for Hamming Distance.

class Solution {
    public int hammingDistance(int x, int y) {
        int dist = 0;
        int num = x ^ y;
        
        while (num > 0) {
            dist += num & 1;
            num >>= 1;
        }
        
        return dist;
    }
}