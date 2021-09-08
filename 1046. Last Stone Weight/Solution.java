// Runtime: 0 ms, faster than 100.00% of Java online submissions for Last Stone Weight.
// Memory Usage: 36.1 MB, less than 96.19% of Java online submissions for Last Stone Weight.

class Solution {
    public int lastStoneWeight(int[] stones) {
        for (int i = stones.length - 2; i >= 0; --i) {
            if (stones[i+1] != Integer.MAX_VALUE) {
            Arrays.sort(stones);
                if (stones[i] != stones[i+1]) {
                    stones[i] = stones[i+1] - stones[i];
                } else {
                    stones[i] = stones[i+1] = Integer.MAX_VALUE;
                    --i;
                }
            }
        }
        
        return stones[0] == Integer.MAX_VALUE ? 0 : stones[0];
    }
}