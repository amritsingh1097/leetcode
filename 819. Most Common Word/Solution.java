// Runtime: 20 ms, faster than 28.42% of Java online submissions for Most Common Word.
// Memory Usage: 38.9 MB, less than 93.81% of Java online submissions for Most Common Word.

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        String[] w = paragraph.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().split("\\s+");
        
        Set<String> b = new HashSet<>();
        
        for (String s : banned)
            b.add(s);
        
        Map<String, Integer> mp = new HashMap<>();
        
        for (String s : w) {
            if (!b.contains(s))
                mp.put(s, mp.getOrDefault(s, 0) + 1);
        }
        
        return Collections.max(mp.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}