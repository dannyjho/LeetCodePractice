package LongestSubstringWithoutRepeatingCharacters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLongestSubstringTest {

    @Test
    public void When_Input_Empty_String_Then_Output_Is_0() {
        String input = "";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(0, output);
    }

    @Test
    public void When_Input_blank_Then_Output_Is_1() {
        String input = " ";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(1, output);
    }

    @Test
    public void When_Input_bbbbb_Then_Output_Is_1() {
        String input = "bbbbb";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(1, output);
    }

    @Test
    public void When_Input_au_Then_Output_Is_2() {
        String input = "au";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(2, output);
    }

    @Test
    public void When_Input_aul_Then_Output_Is_3() {
        String input = "aul";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(3, output);
    }

    @Test
    public void When_Input_abcabcbb_Then_Output_Is_3() {
        String input = "abcabcbb";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(3, output);
    }

    @Test
    public void When_Input_pwwkew_Then_Output_Is_1() {
        String input = "pwwkew";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(3, output);
    }

    @Test
    public void When_Input_dvdf_Then_Output_Is_3() {
        String input = "dvdf";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int output = lengthOfLongestSubstring.lengthOfLongestSubstring(input);
        assertEquals(3, output);
    }
}