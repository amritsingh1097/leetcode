class Solution {
    public int[] evenOddBit(int n) {
        int[] arr = new int[2];
        boolean even = true;
        
        while (n > 0) {
            if (even) arr[0] += n & 1;
            else arr[1] += n & 1;

            n >>= 1;
            even = !even;
        }

        return arr;
    }
}
