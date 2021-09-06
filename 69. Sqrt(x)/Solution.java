// Runtime: 1 ms, faster than 99.98% of Java online submissions for Sqrt(x).
// Memory Usage: 35.7 MB, less than 92.21% of Java online submissions for Sqrt(x).

class Solution {
    public int mySqrt(int x) {
        
        if (x == 0 | x == 1)    return x;
        
        int left = 1;
        int right = x;
        int mid = 0;
        int ans = 0;
        
        while (left <= right) {
            
            mid = (left + right) / 2;
            
            if (mid * mid == x)  return mid;
            
            if (mid > x/mid)   right = mid - 1;
            else {
                left = mid + 1;
                ans = mid;
            }
            
        }
        
        return ans;
    }
}