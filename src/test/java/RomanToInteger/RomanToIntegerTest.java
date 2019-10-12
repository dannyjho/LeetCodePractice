package RomanToInteger;

import org.junit.Assert;
import org.junit.Test;

public class RomanToIntegerTest {
    @Test
    public void When_Input_IV_Then_Return_4() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("IV");
        Assert.assertEquals(4, result);
    }

    @Test
    public void When_Input_IX_Then_Return_9() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("IX");
        Assert.assertEquals(9, result);
    }

    @Test
    public void When_Input_LVIII_Then_Return_58() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("LVIII");
        Assert.assertEquals(58, result);
    }

    @Test
    public void When_Input_MCMXCIV_Then_Return_1994() {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInteger("MCMXCIV");
        Assert.assertEquals(1994, result);
    }
}