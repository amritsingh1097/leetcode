class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> mp = new HashMap<>();

        for (List<String> path : paths) {
            mp.put(path.get(0), path.get(1));
        }

        String dest = "";
        for (Map.Entry<String, String> e : mp.entrySet()) {
            if (!mp.containsKey(e.getValue())) {
                dest = e.getValue();
                break;
            }
        }

        return dest;
    }
}
