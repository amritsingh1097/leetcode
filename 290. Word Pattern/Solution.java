class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] p = pattern.toCharArray();
        String[] arr = s.split(" ");
        
        if (p.length != arr.length) return false;
        
        Map<Character, String> mp = new HashMap<>();
        for (int i = 0; i < p.length; ++i) {
            if ((mp.containsKey(p[i]) && !arr[i].equalsIgnoreCase(mp.get(p[i])))
                || (!mp.containsKey(p[i]) && mp.containsValue(arr[i]))) {
                return false;
            } else {
                mp.put(p[i], arr[i]);
            }
        }
        
        return true;
    }
}
