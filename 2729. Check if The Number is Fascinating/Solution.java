class Solution {
    public boolean isFascinating(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(2 * n);
        sb.append(3 * n);

        boolean[] num = new boolean[10];
        for (int i = 0; i < sb.length(); ++i) {
            int c = sb.charAt(i) - '0';
            if (c == 0 || num[c]) return false;
            
            num[c] = true;
        }

        return true;
    }
}
