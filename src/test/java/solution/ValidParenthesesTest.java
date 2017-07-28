package solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void isValidMyAnswer() throws Exception {
        String str;
        str = "()";
        assertTrue(ValidParentheses.isValidMyAnswer(str));

        str = "(){}[]";
        assertTrue(ValidParentheses.isValidMyAnswer(str));

        str = "(]";
        assertFalse(ValidParentheses.isValidMyAnswer(str));

        str = "([)]";
        assertFalse(ValidParentheses.isValidMyAnswer(str));

        str = "(";
        assertFalse(ValidParentheses.isValidMyAnswer(str));

        str = "([";
        assertFalse(ValidParentheses.isValidMyAnswer(str));

        str = "({[]}) ";
        assertTrue(ValidParentheses.isValidMyAnswer(str));
    }

}