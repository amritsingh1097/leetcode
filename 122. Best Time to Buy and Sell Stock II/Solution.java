// RRuntime: 0 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock II.
// Memory Usage: 38.4 MB, less than 83.62% of Java online submissions for Best Time to Buy and Sell Stock II.

class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        
        for (int i = 1; i < prices.length; ++i) {
            if (prices[i] > prices[i-1])   profit += prices[i] - prices[i-1];
        }
        
        return profit;
    }
}