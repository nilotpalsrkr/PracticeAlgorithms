package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q266_Palindrome_PermutationTest {

    @Test
    void canPermutePalindrome() {
        String s = "codec";
        Q266_Palindrome_Permutation q266_palindrome_permutation = new Q266_Palindrome_Permutation();
        boolean result = q266_palindrome_permutation.canPermutePalindrome(s);
        assertEquals(false, result);
    }
    @Test
    void canPermutePalindrome1() {
        String s = "cca";
        Q266_Palindrome_Permutation q266_palindrome_permutation = new Q266_Palindrome_Permutation();
        boolean result = q266_palindrome_permutation.canPermutePalindrome(s);
        assertEquals(true, result);
    }
    @Test
    void canPermutePalindrome2() {
        String s = "c";
        Q266_Palindrome_Permutation q266_palindrome_permutation = new Q266_Palindrome_Permutation();
        boolean result = q266_palindrome_permutation.canPermutePalindrome(s);
        assertEquals(true, result);
    }
    @Test
    void canPermutePalindrome3() {
        String s = "carerac";
        Q266_Palindrome_Permutation q266_palindrome_permutation = new Q266_Palindrome_Permutation();
        boolean result = q266_palindrome_permutation.canPermutePalindrome(s);
        assertEquals(true, result);
    }
}