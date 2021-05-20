package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q953_Verifying_an_Alien_DictionaryTest {

    @Test
    void isAlienSorted() {
        String[] words = {"hello","leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        Q953_Verifying_an_Alien_Dictionary q953_verifying_an_alien_dictionary = new Q953_Verifying_an_Alien_Dictionary();
        boolean result = q953_verifying_an_alien_dictionary.isAlienSorted(words, order);
        assertTrue(result);
    }
}