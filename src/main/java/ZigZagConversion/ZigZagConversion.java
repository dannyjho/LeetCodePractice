package ZigZagConversion;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (s == null) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }

        int length = s.length();
        int steps = 2 * numRows - 2;
        String result = "";
        for (int i = 0; i < numRows; ++i) {
            for (int j = 0; j < length; j += steps) {
                int p = j + i;
                if (p < length) result += s.charAt(p);
                p = j + steps - i;
                if (i != numRows - 1 && i != 0 && p < length) result += s.charAt(p);
            }
        }
        return result;
    }
}
