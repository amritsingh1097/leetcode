// Runtime: 17 ms, faster than 79.43% of Java online submissions for Boats to Save People.
// Memory Usage: 50.4 MB, less than 90.01% of Java online submissions for Boats to Save People.

class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int left = 0;
        int right = people.length - 1;
        int numBoats = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                ++left;
            }
            
            --right;
            ++numBoats;
        }
        
        return numBoats;
    }
}
