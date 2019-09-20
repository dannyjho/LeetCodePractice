package ReverseInteger;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void When_Input_123_Then_Should_Return_321() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(123);
        Assert.assertEquals(321, result);
    }

    @Test
    public void When_Input_Minus_123_Then_Should_Return_Minus_321() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(-123);
        Assert.assertEquals(-321, result);
    }

    @Test
    public void When_Input_120_Then_Should_Return_21() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverse(120);
        Assert.assertEquals(21, result);
    }

}