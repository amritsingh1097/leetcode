class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digSum = 0;
        for (int n : nums) {
            eleSum += n;

            while (n > 0) {
                digSum += n % 10;
                n /= 10;
            }
        }

        return Math.abs(eleSum - digSum);
    }
}
