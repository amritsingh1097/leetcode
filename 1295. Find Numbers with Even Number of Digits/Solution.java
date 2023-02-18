class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        
        for (int n : nums) {
            // int c = 0;
            boolean even = true;
            while (n > 0) {
                n /= 10;
                // ++c;
                even = !even;
            }

            // if (c % 2 == 0) ++count;
            if (even) ++count;
        }

        return count;
    }
}
