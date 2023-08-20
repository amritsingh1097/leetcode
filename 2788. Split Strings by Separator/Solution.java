class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); ++i) {
                if (word.charAt(i) == separator) {
                    if (!sb.isEmpty()) res.add(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.append(word.charAt(i));
                }
            }
            
            if (!sb.isEmpty()) res.add(sb.toString());
        }

        return res;
    }
}
