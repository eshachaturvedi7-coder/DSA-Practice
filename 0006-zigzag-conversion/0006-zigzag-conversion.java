class Solution {
    public String convert(String s, int numRows) {
        if(numRows== 1 || numRows >= s.length()) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int cycle = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            int j = i;
            while (j < n) {
                sb.append(s.charAt(j));
                if (i != 0 && i != numRows - 1) {
                    int midIndex = j + cycle - 2 * i;
                    if (midIndex < n) {
                        sb.append(s.charAt(midIndex));
                    }
                }
                j += cycle;
            }
        }
        return sb.toString();
    }
}