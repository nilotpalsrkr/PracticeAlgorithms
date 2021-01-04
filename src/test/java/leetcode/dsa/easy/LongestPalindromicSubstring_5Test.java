package leetcode.dsa.easy;

import leetcode.dsa.medium.LongestPalindromicSubstring_5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstring_5Test {

    @Test
    void longestPalindrome1() {
        String testString = "babab";
        LongestPalindromicSubstring_5 longestPalindromicSubstring_5 = new LongestPalindromicSubstring_5();
        String actual = longestPalindromicSubstring_5.longestPalindrome(testString);

        assertEquals("babab", actual);
    }
    @Test
    void longestPalindrome2() {
        String testString = "bb";
        LongestPalindromicSubstring_5 longestPalindromicSubstring_5 = new LongestPalindromicSubstring_5();
        String actual = longestPalindromicSubstring_5.longestPalindrome(testString);

        assertEquals("bb", actual);
    }

    @Test
    void longestPalindrome3() {
        String testString = "bbcbb";
        LongestPalindromicSubstring_5 longestPalindromicSubstring_5 = new LongestPalindromicSubstring_5();
        String actual = longestPalindromicSubstring_5.longestPalindrome(testString);

        assertEquals("bbcbb", actual);
    }
    @Test
    void longestPalindrome4() {
        String testString = "bb";
        LongestPalindromicSubstring_5 longestPalindromicSubstring_5 = new LongestPalindromicSubstring_5();
        String actual = longestPalindromicSubstring_5.longestPalindrome(testString);

        assertEquals("bb", actual);
    }
    @Test
    void longestPalindrome5() {
        String testString = "bbb";
        LongestPalindromicSubstring_5 longestPalindromicSubstring_5 = new LongestPalindromicSubstring_5();
        String actual = longestPalindromicSubstring_5.longestPalindrome(testString);

        assertEquals("bb", actual);
    }
}