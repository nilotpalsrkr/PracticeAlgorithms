package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q159_Longest_Substring_with_At_Most_Two_Distinct_CharactersTest {

    @Test
    void lengthOfLongestSubstringTwoDistinct() {
        String s = "eceba";

        Q159_Longest_Substring_with_At_Most_Two_Distinct_Characters q159_longest_substring_with_at_most_two_distinct_characters = new Q159_Longest_Substring_with_At_Most_Two_Distinct_Characters();

        int result = q159_longest_substring_with_at_most_two_distinct_characters.lengthOfLongestSubstringTwoDistinct(s);

        assertEquals(3, result);
    }
}