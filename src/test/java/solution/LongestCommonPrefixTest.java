package solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void longestCommonPrefix() throws Exception {
        String[] strs1 = {"gee", "geechat", "geeaux"};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs1), "gee");

        String[] strs2 = {"geebox", "geechat", "geeaux"};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs2), "gee");

        String[] strs3 = {"gkdfladjfkads", "godflasd", "gtttttt"};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs3), "g");

        String[] strs4 = {""};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs4), "");

        String[] strs5 = {"", ""};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs5), "");

        String[] strs6 = {"", "b"};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs6), "");

        String[] strs7 = {"aa", "a"};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs7), "a");

        String[] strs8 = {"a"};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs8), "a");

        String[] strs9 = {"aaa", "aa", "aaa"};
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs9), "aa");

    }
}