class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int t : tasks) {
            freqMap.put(t, freqMap.getOrDefault(t, 0) + 1);
        }

        int count = 0;
        for (Integer freq : freqMap.values()) {
            if (freq == 1) return -1;

            count += freq / 3;
            if (freq % 3 > 0) ++count;
        }
        
        return count;
    }
}
