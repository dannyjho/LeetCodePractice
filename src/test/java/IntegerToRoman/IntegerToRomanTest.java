package IntegerToRoman;

import org.junit.Assert;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void When_Input_3_Then_Return_III() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String intToRoman = integerToRoman.intToRoman(3);
        Assert.assertEquals("III", intToRoman);
    }

    @Test
    public void When_Input_4_Then_Return_IV() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String intToRoman = integerToRoman.intToRoman(4);
        Assert.assertEquals("IV", intToRoman);
    }

    @Test
    public void When_Input_9_Then_Return_IX() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String intToRoman = integerToRoman.intToRoman(9);
        Assert.assertEquals("IX", intToRoman);
    }

    @Test
    public void When_Input_58_Then_Return_LVIII() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String intToRoman = integerToRoman.intToRoman(58);
        Assert.assertEquals("LVIII", intToRoman);
    }

    @Test
    public void When_Input_1994_Then_Return_MCMXCIV() {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        String intToRoman = integerToRoman.intToRoman(1994);
        Assert.assertEquals("MCMXCIV", intToRoman);
    }
}