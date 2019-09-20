package StringToInteger;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    @Test
    public void When_Input_String_Minus_42_Then_Should_Return_Integer_Minus_42() {
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("-42");
        Assert.assertEquals(-42,result);
    }

    @Test
    public void When_Input_String_words_and_987_Then_Should_Return_Integer_987() {
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("words and 987");
        Assert.assertEquals(0,result);
    }

    @Test
    public void When_Input_String_Minus_91283472332_Then_Should_Return_Integer_Minus_2147483648() {
        StringToInteger stringToInteger = new StringToInteger();
        int result = stringToInteger.myAtoi("-91283472332");
        Assert.assertEquals(-2147483648,result);
    }
}