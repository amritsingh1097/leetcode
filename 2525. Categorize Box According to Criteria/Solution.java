class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = 1L * length * width * height;
        boolean bulky = (vol >= 1000000000 || length >= 10000 || width >= 10000 || height >= 10000);
        boolean heavy = (mass >= 100);
        
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}
