package LetterCombinationOfAPhoneNumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class LetterCombinationOfAPhoneNumberTest {
    @Test
    public void When_Input_23_Then_Return_Correct_List() {
        LetterCombinationOfAPhoneNumber letterCombinationOfAPhoneNumber = new LetterCombinationOfAPhoneNumber();
        List<String> result = letterCombinationOfAPhoneNumber.letterCombinations("23");

        Assert.assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), result);
    }
}