// Runtime: 5 ms, faster than 85.03% of Java online submissions for Summary Ranges.
// Memory Usage: 37.3 MB, less than 81.05% of Java online submissions for Summary Ranges.

class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> l = new ArrayList<>();
        
        if (nums.length == 0)   return l;
        
        int st = 0;
        int i = 1;
        for (i = 1; i < nums.length; ++i) {
            if (nums[i] - nums[i-1] != 1) {
                if (st == i-1)  l.add(String.valueOf(nums[st]));
                else    l.add(nums[st] + "->" + nums[i-1]);
                st = i;
            }
        }
        
        if (st == i-1) {
            l.add(String.valueOf(nums[st]));
        } else {
            l.add(nums[st] + "->" + nums[i-1]);
        }
        
        
        return l;
    }
}