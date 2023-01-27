class Solution {
    public String[] divideString(String s, int k, char fill) {
        int rem = s.length() % k;
        int groups = (int) Math.ceil(s.length() / (double) k);

        StringBuilder sb = new StringBuilder(s);
        if (rem > 0) {
            for (int i = 0; i < k - rem; ++i) sb.append(fill);
        }

        String[] arr = new String[groups];
        for (int i = 0; i < sb.length(); i += k) {
            arr[i/k] = sb.substring(i, i + k);
        }
        
        return arr;
    }
}
