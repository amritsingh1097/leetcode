// Runtime: 0 ms, faster than 100.00% of Java online submissions for Pascal's Triangle II.
// Memory Usage: 36.3 MB, less than 96.10% of Java online submissions for Pascal's Triangle II.

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        
        ++rowIndex;
        Long res = 1L;
        for (int i = 1; i < rowIndex; ++i) {
            list.add(res.intValue());
            res = res * (rowIndex - i) / i;
        }
        
        list.add(1);
        
        return list;
    }
}