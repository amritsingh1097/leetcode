class Solution {
    public String removeTrailingZeros(String num) {
        int ind = num.length() - 1;

        while (num.charAt(ind) == '0') --ind;

        return num.substring(0, ind + 1);
    }
}
