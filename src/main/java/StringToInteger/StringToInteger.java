package StringToInteger;

public class StringToInteger {
    public int myAtoi(String str) {
        int sign = 1;
        int i = 0;
        long value = 0;
        while (i < str.length() && str.charAt(i) == ' ') {
            i++;
        }
        if (i < str.length() && (str.charAt(i) == '-' || str.charAt(i) == '+')) {
            if (str.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }
        while (i < str.length() && Character.isDigit(str.charAt(i))) {
            value = value * 10 + (long) (str.charAt(i) - '0');
            if (value > Integer.MAX_VALUE || value < Integer.MIN_VALUE) {
                break;
            }
            i++;
        }
        value = value * sign;
        if (value > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (value < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) value;
    }
}
