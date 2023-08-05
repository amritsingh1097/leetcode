class Solution {
    public int partitionString(String s) {
        return partitionStringUsingArray(s);
    }

    // Using Set is expensive because we have to clear it everytime we start with new substring
    private int partitionStringUsingSet(String s) {
        Set<Character> set = new HashSet<>();
        int count = 1;

        for (int i = 0; i < s.length(); ++i) {
            if (set.contains(s.charAt(i))) {
                set.clear();
                ++count;
            }

            set.add(s.charAt(i));
        }

        return count;
    }

    private int partitionStringUsingArray(String s) {
        int[] seen = new int[26];
        Arrays.fill(seen, -1);

        int count = 1;
        int st = 0;

        for (int i = 0; i < s.length(); ++i) {
            int ind = s.charAt(i) - 'a';

            if (seen[ind] >= st) {
                st = i;
                ++count;
            }

            seen[ind] = i;
        }

        return count;
    }

    private int partitionStringUsingBitManipulation(String s) {
        int count = 1;
        int mask = 0;

        for (int i = 0; i < s.length(); ++i) {
            int shift = s.charAt(i) - 'a';
            
            if ((mask & (1 << shift)) > 0) {
                ++count;
                mask = 0;
            }
            
            mask |= 1 << shift;
        }

        return count;
    }
}
