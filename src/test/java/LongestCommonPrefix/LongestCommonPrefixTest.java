package LongestCommonPrefix;

import org.junit.Assert;
import org.junit.Test;

public class LongestCommonPrefixTest {

    @Test
    public void When_Input_3_Strings_Contain_fl_Then_Prefix_Is_Equal_fl() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        Assert.assertEquals("fl", result);
    }

    @Test
    public void When_Input_3_Strings_Contain_Empty_Then_Prefix_Is_Equal_Empty() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String result = longestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"});
        Assert.assertEquals("", result);
    }
}