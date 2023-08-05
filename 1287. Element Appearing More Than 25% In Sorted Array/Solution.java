class Solution {
    public int findSpecialInteger(int[] arr) {
        int threshold = arr.length / 4;
        int last = arr[0];
        int count = 0;

        for (int n : arr) {
            if (n == last) {
                ++count;
                if (count > threshold) {
                    last = n;
                    break;
                }
            } else {
                last = n;
                count = 1;
            }
        }

        return last;
    }
}
