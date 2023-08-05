class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<>();
        
        for (int i = left; i <= right; ++i) {
            int n = i;
            boolean flag = true;
            
            while (n > 0) {
                int t = n % 10;
                if (t == 0 || i % t != 0) {
                    flag = false;
                    break;
                }
                n /= 10;
            }
            
            if (flag) l.add(i);
        }

        return l;
    }
}
