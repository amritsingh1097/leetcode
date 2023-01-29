class Solution {
    public int alternateDigitSum(int n) {
        return approach2(n);
    }

    public int approach1(int n) {
        int sum1 = 0, mul1 = 1;
        int sum2 = 0, mul2 = -1;
        int count = 0;

        while (n > 0) {
            sum1 += (n % 10) * mul1;
            sum2 += (n % 10) * mul2;
            mul1 *= -1;
            mul2 *= -1;
            n /= 10;
            ++count;
        }

        return count % 2 == 0 ? sum2 : sum1;
    }

    public int approach2(int n) {
        int oddSum = 0;
        int evenSum = 0;
        int count = 0;

        while (n > 0) {
            if (count % 2 == 0) oddSum += n % 10;
            else evenSum += n % 10;

            n /= 10;
            ++count;
        }

        return count % 2 == 0 ? evenSum - oddSum : oddSum - evenSum;
    }
}
