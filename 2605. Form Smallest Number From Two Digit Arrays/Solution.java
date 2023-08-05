class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int min1 = nums1[0];
        int min2 = nums2[0];
        int min = 10;

        for (int i = 0; i < nums1.length; ++i) {
            if (min1 > nums1[i]) min1 = nums1[i];

            for (int j = 0; j < nums2.length; ++j) {
                if (min2 > nums2[j]) min2 = nums2[j];
                
                if (nums1[i] == nums2[j] && min > nums1[i]) min = nums1[i];
            }
        }

        if (min < 10) return min;

        return (min1 < min2) ? min1 * 10 + min2 : min2 * 10 + min1;
    }
}
