// Runtime: 0 ms, faster than 100.00% of Java online submissions for Combination Sum III.
// Memory Usage: 40 MB, less than 86.12% of Java online submissions for Combination Sum III.

class Solution {
    List<List<Integer>> combinations = new ArrayList<>();
    List<Integer> comb = new ArrayList<>();
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        findCombinations(k, n, 1);
        return combinations;
    }
    
    private void findCombinations(int k, int n, int start) {
        if (k == 0 && n == 0) {
            combinations.add(new ArrayList<>(comb));
        } else {
            for (int i = start; i < 10; ++i) {
                comb.add(i);
                findCombinations(k - 1, n - i, i + 1);
                comb.remove(comb.size() - 1);
            }
        }
    }
}
