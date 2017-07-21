package solution;


/**
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class RomanToInteger {

    private static final char I = 'I';//1
    private static final char V = 'V';//5
    private static final char X = 'X';//10
    private static final char L = 'L';//50
    private static final char C = 'C';//100
    private static final char D = 'D';//500
    private static final char M = 'M';//1000

    public static int answer1(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case I:
                    result += 1;
                    break;
                case V://5
                    if (i > 0 && s.charAt(i -1) == I) {
                        result += 3;
                    } else {
                        result += 5;
                    }
                    break;
                case X:
                    if (i > 0 && s.charAt(i -1) == I) {
                        result += 8;
                    } else {
                        result += 10;
                    }
                    break;
                case L://50
                    if (i > 0 && s.charAt(i -1) == X) {
                        result += 30;
                    } else {
                        result += 50;
                    }
                    break;
                case C:
                    if (i > 0 && s.charAt(i -1) == X) {
                        result += 80;
                    } else {
                        result += 100;
                    }
                    break;
                case D://50
                    if (i > 0 && s.charAt(i -1) == C) {
                        result += 300;
                    } else {
                        result += 500;
                    }
                    break;
                case M:
                    if (i > 0 && s.charAt(i -1) == C) {
                        result += 800;
                    } else {
                        result += 1000;
                    }
                    break;
            }
        }

        return result;
    }
}
