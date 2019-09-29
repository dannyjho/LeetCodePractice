package PalindromeNumber;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {
    @Test
    public void When_Input_121_Then_Return_True() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindrome = palindromeNumber.isPalindrome(121);
        System.out.println(isPalindrome);
        Assert.assertTrue(isPalindrome);
    }

    @Test
    public void When_Input_Minus_121_Then_Return_True() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindrome = palindromeNumber.isPalindrome(-121);
        Assert.assertFalse(isPalindrome);
    }

    @Test
    public void When_Input_10_Then_Return_True() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        boolean isPalindrome = palindromeNumber.isPalindrome(10);
        Assert.assertFalse(isPalindrome);
    }
}