import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author caifx
 * @create Created in 22:43 2020/8/26
 * @modified By:
 **/
class ValidParenthesesTest {

    @Test
    void isValid() {
        ValidParentheses validParentheses =new ValidParentheses();
        Assert.assertTrue(validParentheses.isValid("{}()[]"));
        Assert.assertTrue(validParentheses.isValid("{[]}"));
        Assert.assertFalse(validParentheses.isValid("{}([)]"));
        Assert.assertTrue(validParentheses.isValid(""));
        Assert.assertFalse(validParentheses.isValid("(]"));
        Assert.assertFalse(validParentheses.isValid("("));
        Assert.assertFalse(validParentheses.isValid("]"));
        Assert.assertFalse(validParentheses.isValid("([{"));

    }
}