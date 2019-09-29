package RegularExpressionMatching;

import org.junit.Assert;
import org.junit.Test;

public class RegularExpressionMatchingTest {

    @Test
    public void When_Input_a_and_a_Then_Return_True() {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean isMatch = regularExpressionMatching.isMatch("a", "a");
        Assert.assertTrue(isMatch);
    }

    @Test
    public void When_Input_a_and_point_Then_Return_True() {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean isMatch = regularExpressionMatching.isMatch("a", ".");
        Assert.assertTrue(isMatch);
    }

    @Test
    public void When_Input_aa_and_a_Then_Return_False() {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean isMatch = regularExpressionMatching.isMatch("aa", "a");
        Assert.assertFalse(isMatch);
    }

    @Test
    public void When_Input_aa_and_a_star_sign_Then_Return_True() {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean isMatch = regularExpressionMatching.isMatch("aa", "a*");
        Assert.assertTrue(isMatch);
    }

    @Test
    public void When_Input_aab_and_c_star_a_star_b_Then_Return_True() {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean isMatch = regularExpressionMatching.isMatch("aab", "c*a*b");
        Assert.assertTrue(isMatch);
    }

    @Test
    public void When_Input_mississippi_and_mis_star_is_star_p_star_point_Then_Return_True() {
        RegularExpressionMatching regularExpressionMatching = new RegularExpressionMatching();
        boolean isMatch = regularExpressionMatching.isMatch("aab", "c*a*b");
        Assert.assertTrue(isMatch);
    }


}