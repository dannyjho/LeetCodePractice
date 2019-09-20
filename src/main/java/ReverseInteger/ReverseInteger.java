package ReverseInteger;

public class ReverseInteger {
    public int reverse(int x) {
        boolean minusFlag = false;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        if (stringBuilder.lastIndexOf("-") == 0) {
            stringBuilder.deleteCharAt(0);
            minusFlag = true;
        } else if (stringBuilder.lastIndexOf("-") == (stringBuilder.length() - 1)) {
            return 0;
        }

        stringBuilder = stringBuilder.reverse();
        Long tempResult = Long.parseLong(stringBuilder.toString());
        if (tempResult > Integer.MAX_VALUE || tempResult < Integer.MIN_VALUE) {
            return 0;
        } else {
            if (minusFlag) {
                return 0 - Integer.parseInt(stringBuilder.toString());
            } else {
                return Integer.parseInt(stringBuilder.toString());
            }
        }
    }
}
