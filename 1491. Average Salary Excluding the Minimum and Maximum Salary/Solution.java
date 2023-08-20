class Solution {
    public double average(int[] salary) {
        int min = salary[0];
        int max = 0;
        long sum = 0;
        
        for (int n : salary) {
            sum += n;
            if (min > n) min = n;
            if (max < n) max = n;
        }

        return (double)(sum - min - max) / (salary.length - 2);
    }
}
