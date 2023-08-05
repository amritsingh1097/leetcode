class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] textArr = text.split(" ");
        List<String> l = new ArrayList<>();
        
        for (int i = 0; i < textArr.length - 2; ++i) {
            if (textArr[i].equals(first) && textArr[i + 1].equals(second)) l.add(textArr[i + 2]);
        }

        textArr = new String[l.size()];
        for (int i = 0; i < l.size(); ++i) {
            textArr[i] = l.get(i);
        }
        
        return textArr;
    }
}
