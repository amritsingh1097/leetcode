class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        long sum = 0;
        
        while (l < r) {
            long a = nums[l];
            int b = nums[r];
            
            while (b > 0) {
                b /= 10;
                a *= 10;
            }

            sum += a + nums[r];
            ++l;
            --r;
        }

        if (l == r) sum += nums[l];

        return sum;
    }
}
