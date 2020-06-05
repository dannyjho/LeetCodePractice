package ValidParentheses;

import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {
    @Test
    public void input_then_return_true() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid("()"));
    }

    @Test
    public void input_3_then_return_true() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid("()[]{}"));
    }

    @Test
    public void input_2_then_return_false() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertFalse(validParentheses.isValid("(]"));
    }

    @Test
    public void input_2_then_return_true() {
        ValidParentheses validParentheses = new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid(""));
    }
}
