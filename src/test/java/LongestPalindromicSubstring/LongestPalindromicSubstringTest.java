package LongestPalindromicSubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void When_Input_Is_babad_Then_Should_Return_bab() {
        String input = "babad";

        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String result = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals("bab",result);
    }

    @Test
    public void When_Input_Is_cbbd_Then_Should_Return_bab() {
        String input = "cbbd";

        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String result = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals("bb",result);
    }

    @Test
    public void When_Input_Is_ac_Then_Should_Return_a() {
        String input = "ac";

        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String result = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals("a",result);
    }

    @Test
    public void When_Input_Is_bb_Then_Should_Return_bb() {
        String input = "bb";

        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String result = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals("bb",result);
    }

    @Test
    public void When_Input_Is_abcda_Then_Should_Return_a() {
        String input = "abcda";

        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
        String result = longestPalindromicSubstring.longestPalindrome(input);
        Assert.assertEquals("a",result);
    }

}