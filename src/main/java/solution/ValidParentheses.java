package solution;


import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order,
 * "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {

    private static final char ROUND_BRAKETS_OPEN = '(';
    private static final char ROUND_BRAKETS_CLOSE = ')';
    private static final char CURLY_BRAKETS_OPEN = '{';
    private static final char CURLY_BRAKETS_CLOSE = '}';
    private static final char SQUARE_BRAKETS_OPEN = '[';
    private static final char SQUARE_BRAKETS_CLOSE = ']';


    private static final int ROUND = 0;
    private static final int CURLY = 1;
    private static final int SQUARE = 2;


    public static boolean isValidMyAnswer(String s) {

        if (s == null || s.length() <= 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case ROUND_BRAKETS_OPEN:
                    stack.push(ROUND_BRAKETS_OPEN);
                    break;
                case ROUND_BRAKETS_CLOSE:{
                    char open = getPopChar(stack);
                    if (open == '0' || open != ROUND_BRAKETS_OPEN) {
                        return false;
                    }
                }
                    break;
                case CURLY_BRAKETS_OPEN:
                    stack.push(CURLY_BRAKETS_OPEN);
                    break;
                case CURLY_BRAKETS_CLOSE: {
                    char open = getPopChar(stack);
                    if (open == '0' || open != CURLY_BRAKETS_OPEN) {
                        return false;
                    }
                }
                    break;
                case SQUARE_BRAKETS_OPEN:
                    stack.push(SQUARE_BRAKETS_OPEN);
                    break;
                case SQUARE_BRAKETS_CLOSE:{
                    char open = getPopChar(stack);
                    if (open == '0' || open != SQUARE_BRAKETS_OPEN) {
                        return false;
                    }
                }
                    break;
            }
        }
        return stack.empty();
    }

    public static char getPopChar(Stack<Character> stack) {
        char c;
        try {
            c = stack.pop();
        } catch (Exception e) {
            return '0';
        }
        return c;
    }
}
