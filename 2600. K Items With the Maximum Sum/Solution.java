class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // if (numOnes > k) return k;
        // if (numOnes + numZeros > k) return numOnes;
        // return numOnes - (k - (numOnes + numZeros));

        return Math.min(numOnes, k) - Math.max(0, k - numOnes - numZeros);
    }
}
