class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int c = -1;
        int i = 0;
        
        while (n > 0) {
            if (n % 10 == 6) c = i;
            n /= 10;
            ++i;
        }

        if (c != -1)  num += Math.pow(10, c) * 3;

        return num;
    }
}
