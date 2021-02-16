package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q3_Longest_Substring_Without_Repeating_CharactersTest {

    @Test
    void lengthOfLongestSubstring() {
        Q3_Longest_Substring_Without_Repeating_Characters q3_longest_substring_without_repeating_characters = new Q3_Longest_Substring_Without_Repeating_Characters();
        String s = "abcabcaa";
        int result = q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s);

        assertEquals(3, result);
    }

    @Test
    void lengthOfLongestSubstring1() {
        Q3_Longest_Substring_Without_Repeating_Characters q3_longest_substring_without_repeating_characters = new Q3_Longest_Substring_Without_Repeating_Characters();
        String s = "abcabcaabcd";
        int result = q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s);

        assertEquals(4, result);
    }

    @Test
    void lengthOfLongestSubstring2() {
        Q3_Longest_Substring_Without_Repeating_Characters q3_longest_substring_without_repeating_characters = new Q3_Longest_Substring_Without_Repeating_Characters();
        String s = "aaaa";
        int result = q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s);

        assertEquals(1, result);
    }
    @Test
    void lengthOfLongestSubstring3() {
        Q3_Longest_Substring_Without_Repeating_Characters q3_longest_substring_without_repeating_characters = new Q3_Longest_Substring_Without_Repeating_Characters();
        String s = "aebdcbcaabcd";
        int result = q3_longest_substring_without_repeating_characters.lengthOfLongestSubstring(s);

        assertEquals(5, result);
    }
}