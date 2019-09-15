package ZigZagConversion;

import org.junit.Assert;
import org.junit.Test;

public class ZigZagConversionTest {

    @Test
    public void When_Input_PAYPALISHIRING_And_4_Then_Should_Return_PINALSIGYAHRPI() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert("PAYPALISHIRING", 4);
        Assert.assertEquals("PINALSIGYAHRPI", result);
    }

    @Test
    public void When_Input_PAYPALISHIRING_And_3_Then_Should_Return_PAHNAPLSIIGYIR() {
        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String result = zigZagConversion.convert("PAYPALISHIRING", 3);
        Assert.assertEquals("PAHNAPLSIIGYIR", result);
    }
}