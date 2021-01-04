package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q9_PalindromeNumberTest {

    @Test
    void isPalindrome1() {
        int x = 121;
        Q9_PalindromeNumber q9_palindromeNumber = new Q9_PalindromeNumber();
        boolean actual = q9_palindromeNumber.isPalindrome(x);
        assertTrue(actual);
    }
    @Test
    void isPalindrome2() {
        int x = 1121;
        Q9_PalindromeNumber q9_palindromeNumber = new Q9_PalindromeNumber();
        boolean actual = q9_palindromeNumber.isPalindrome(x);
        assertFalse(actual);
    }
    @Test
    void isPalindrome3() {
        int x = -121;
        Q9_PalindromeNumber q9_palindromeNumber = new Q9_PalindromeNumber();
        boolean actual = q9_palindromeNumber.isPalindrome(x);
        assertFalse(actual);
    }
    @Test
    void isPalindrome4() {
        int x = 10;
        Q9_PalindromeNumber q9_palindromeNumber = new Q9_PalindromeNumber();
        boolean actual = q9_palindromeNumber.isPalindrome(x);
        assertFalse(actual);
    }
}