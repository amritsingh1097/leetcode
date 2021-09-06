// Runtime: 1 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
// Memory Usage: 51.6 MB, less than 96.11% of Java online submissions for Best Time to Buy and Sell Stock.

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        
        for (int i = 0; i < prices.length; ++i) {
            if (minPrice > prices[i])   minPrice = prices[i];
            else if (profit < prices[i] - minPrice)  profit = prices[i] - minPrice;
        }
        
        return profit;
    }
}