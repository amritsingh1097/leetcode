class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int maxScore = 0;
        int num = divisors[0];
        
        for (int i = 0; i < divisors.length; ++i) {
            int score = 0;
            
            for (int j = 0; j < nums.length; ++j) {
                if (nums[j] % divisors[i] == 0) ++score;
            }

            if (maxScore < score) {
                maxScore = score;
                num = divisors[i];
            } else if (maxScore == score && num > divisors[i]) {
                num = divisors[i];
            }
        }

        return num;
    }
}
