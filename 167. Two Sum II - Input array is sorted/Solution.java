// Runtime: 1 ms, faster than 51.96% of Java online submissions for Two Sum II - Input array is sorted.
// Memory Usage: 39.1 MB, less than 61.35% of Java online submissions for Two Sum II - Input array is sorted.

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] answer = new int[2];
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int i=0; i < numbers.length; ++i) {
            if (mp.containsKey(numbers[i])) {
                answer[0] = mp.get(numbers[i]);
                answer[1] = i+1;
                break;
            } else if (numbers[i] <= target) {
                mp.put(target - numbers[i], i+1);
            }
        }
        
        return answer;
    }
}