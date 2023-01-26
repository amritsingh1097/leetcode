class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;

        for (int n : nums) {
            if (n % 2 == 0 && n % 3 == 0) {
                sum += n;
                ++count;
            }
        }

        return (count == 0) ? 0 : (sum / count);
    }
}
