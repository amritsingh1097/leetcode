class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> l = new ArrayList<>();

        for (int i = nums.length - 1; i >= 0; --i) {
            while (nums[i] > 0) {
                l.add(nums[i] % 10);
                nums[i] /= 10;
            }
        }

        int j = 0;
        nums = new int[l.size()];
        for (int i = l.size() - 1; i >= 0; --i) {
            nums[j] = l.get(i);
            ++j;
        }

        return nums;
    }
}
