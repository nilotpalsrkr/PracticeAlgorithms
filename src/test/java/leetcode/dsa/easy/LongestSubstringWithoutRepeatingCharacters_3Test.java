package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharacters_3Test {

    @Test
    void lengthOfLongestSubstring1() {
        String s = "abcc";
        LongestSubstringWithoutRepeatingCharacters_3 longestSubstringWithoutRepeatingCharacters_3 = new LongestSubstringWithoutRepeatingCharacters_3();
        int longestCharecter = longestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(s);
        assertEquals(longestCharecter,3);
    }
    @Test
    void lengthOfLongestSubstring2() {
        String s = "abccabd";
        LongestSubstringWithoutRepeatingCharacters_3 longestSubstringWithoutRepeatingCharacters_3 = new LongestSubstringWithoutRepeatingCharacters_3();
        int longestCharecter = longestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(s);
        assertEquals(longestCharecter,4);
    }
    @Test
    void lengthOfLongestSubstring3() {
        String s = "aabccabd";
        LongestSubstringWithoutRepeatingCharacters_3 longestSubstringWithoutRepeatingCharacters_3 = new LongestSubstringWithoutRepeatingCharacters_3();
        int longestCharecter = longestSubstringWithoutRepeatingCharacters_3.lengthOfLongestSubstring(s);
        assertEquals(longestCharecter,4);
    }
}