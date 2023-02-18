class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> l = new LinkedList<>();
        
        for (int i = num.length - 1; i >= 0; --i) {
            k += num[i];
            l.add(0, k % 10);
            k /= 10;
        }

        while (k > 0) {
            l.add(0, k % 10);
            k /= 10;
        }
        
        return l;
    }
}
