// Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle.
// Memory Usage: 36.5 MB, less than 97.81% of Java online submissions for Pascal's Triangle.

class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        for (int i = 1; i <= numRows; ++i) {
            
            List<Integer> tmp = new ArrayList<>();
            
            int res = 1;
            for (int j = 1; j < i; ++j) {
                tmp.add(res);
                res = res * (i - j) / j;
            }
            
            tmp.add(1);
            list.add(tmp);
        }
        
        return list;
    }
}