class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        
        for (int n1 : arr1) {
            boolean found = false;

            for (int n2 : arr2) {
                if (Math.abs(n1 - n2) <= d) {
                    found = true;
                    break;
                }
            }

            if (!found) ++count;
        }
        
        return count;
    }
}
