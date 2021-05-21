package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q720_Longest_Word_in_DictionaryTest {

    @Test
    void longestWord() {
        String[] words = {"w","wo","wor","worl","world"};
        Q720_Longest_Word_in_Dictionary q720_longest_word_in_dictionary = new Q720_Longest_Word_in_Dictionary();
        String result = q720_longest_word_in_dictionary.longestWord(words);
        assertEquals("world",result);
    }
    @Test
    void longestWord1() {
        String[] words = {"a","banana","app","appl","ap","apply","apple"};
        Q720_Longest_Word_in_Dictionary q720_longest_word_in_dictionary = new Q720_Longest_Word_in_Dictionary();
        String result = q720_longest_word_in_dictionary.longestWord(words);
        assertEquals("apple",result);
    }
    @Test
    void longestWord2() {
        String[] words = {"a","banana","app","appl","ap","apple","apply"};
        Q720_Longest_Word_in_Dictionary q720_longest_word_in_dictionary = new Q720_Longest_Word_in_Dictionary();
        String result = q720_longest_word_in_dictionary.longestWord(words);
        assertEquals("apple",result);
    }
    @Test
    void longestWord3() {
        String[] words = {"a","banana","app","appl","ap","applf","apply","apple"};
        Q720_Longest_Word_in_Dictionary q720_longest_word_in_dictionary = new Q720_Longest_Word_in_Dictionary();
        String result = q720_longest_word_in_dictionary.longestWord(words);
        assertEquals("apple",result);
    }
}