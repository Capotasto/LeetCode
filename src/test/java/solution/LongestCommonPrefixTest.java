package solution;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {
    @Test
    public void myAnswer() throws Exception {
        String[] strs1 = {"gee", "geechat", "geeaux"};
        assertEquals(LongestCommonPrefix.myAnswer(strs1), "gee");

        String[] strs2 = {"geebox", "geechat", "geeaux"};
        assertEquals(LongestCommonPrefix.myAnswer(strs2), "gee");

        String[] strs3 = {"gkdfladjfkads", "godflasd", "gtttttt"};
        assertEquals(LongestCommonPrefix.myAnswer(strs3), "g");

        String[] strs4 = {""};
        assertEquals(LongestCommonPrefix.myAnswer(strs4), "");

        String[] strs5 = {"", ""};
        assertEquals(LongestCommonPrefix.myAnswer(strs5), "");

        String[] strs6 = {"", "b"};
        assertEquals(LongestCommonPrefix.myAnswer(strs6), "");

        String[] strs7 = {"aa", "a"};
        assertEquals(LongestCommonPrefix.myAnswer(strs7), "a");

        String[] strs8 = {"a"};
        assertEquals(LongestCommonPrefix.myAnswer(strs8), "a");

        String[] strs9 = {"aaa", "aa", "aaa"};
        assertEquals(LongestCommonPrefix.myAnswer(strs9), "aa");

    }

    @Test
    public void Answer1() {
        String[] strs1 = {"gee", "geechat", "geeaux"};
        assertEquals(LongestCommonPrefix.Answer1(strs1), "gee");

        String[] strs2 = {"geebox", "geechat", "geeaux"};
        assertEquals(LongestCommonPrefix.Answer1(strs2), "gee");

        String[] strs3 = {"gkdfladjfkads", "godflasd", "gtttttt"};
        assertEquals(LongestCommonPrefix.Answer1(strs3), "g");

        String[] strs4 = {""};
        assertEquals(LongestCommonPrefix.Answer1(strs4), "");

        String[] strs5 = {"", ""};
        assertEquals(LongestCommonPrefix.Answer1(strs5), "");

        String[] strs6 = {"", "b"};
        assertEquals(LongestCommonPrefix.Answer1(strs6), "");

        String[] strs7 = {"aa", "a"};
        assertEquals(LongestCommonPrefix.Answer1(strs7), "a");

        String[] strs8 = {"a"};
        assertEquals(LongestCommonPrefix.Answer1(strs8), "a");

        String[] strs9 = {"aaa", "aa", "aaa"};
        assertEquals(LongestCommonPrefix.Answer1(strs9), "aa");
    }
}