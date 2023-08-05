class Solution {
    public int diagonalPrime(int[][] nums) {
        int maxPrime = 0;
        
        for (int i = 0; i < nums.length; ++i) {
            if (maxPrime < nums[i][i] && isPrime(nums[i][i])) maxPrime = nums[i][i];
            if (maxPrime < nums[i][nums.length - i - 1] && isPrime(nums[i][nums.length - i - 1])) maxPrime = nums[i][nums.length - i - 1];
        }

        return maxPrime;
    }

    private boolean isPrime(int n) {
        int sqrt = (int) Math.sqrt(n);
        
        for (int i = 2; i <= sqrt; ++i) {
            if (n % i == 0) return false;
        }

        return n > 1;
    }
}
