package PalindromeNumber;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(x);
        String reverseInput = stringBuilder.reverse().toString();
        if (reverseInput.equals(String.valueOf(x))) {
            return true;
        }
        return false;
    }
}
