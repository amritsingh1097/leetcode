// Runtime: 3 ms, faster than 100.00% of Java online submissions for Longest Turbulent Subarray.
// Memory Usage: 42.1 MB, less than 84.99% of Java online submissions for Longest Turbulent Subarray.

class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int i = 0;
        while (++i < arr.length && arr[i - 1] == arr[i]);
        
        if (i == arr.length)
            return 1;
        
        boolean condition = !(arr[i-1] < arr[i]);
        ++i;
        
        int max = 2;
        int currMax = 2;
        while (i < arr.length) {
            if (arr[i-1] != arr[i] && arr[i-1] < arr[i] == condition) {
                condition = !condition;
                ++currMax;
                
                if (max < currMax)
                    max = currMax;
            } else {
                condition = !(arr[i-1] < arr[i]);
                currMax = 2;
            }
            
            ++i;
        }
        
        return max;
    }
}