/**
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        int n = x;
        int rev = 0;
        while (x > 0) {
            int dig = x % 10;
            rev = rev * 10 + dig;
            x = x / 10;
        }
        return n == rev;
    }
}
