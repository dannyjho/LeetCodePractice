package IntegerToRoman;

public class IntegerToRoman {
    public String intToRoman(int num) {
        String result = "";
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result += romans[i];
            }
        }
        return result;
    }
}
