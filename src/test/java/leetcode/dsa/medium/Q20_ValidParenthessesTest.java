package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q20_ValidParenthessesTest {

    @Test
    void isValid() {
        String input = "{}";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertTrue(actual);
    }
    @Test
    void isValid1() {
        String input = "{[]}";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertTrue(actual);
    }
    @Test
    void isValid2() {
        String input = "{[}";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertFalse(actual);
    }
    @Test
    void isValid3() {
        String input = "{[()]}";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertTrue(actual);
    }
    @Test
    void isValid4() {
        String input = "{[(){]}";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertFalse(actual);
    }
    @Test
    void isValid5() {
        String input = "}";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertFalse(actual);
    }

    @Test
    void isValid6() {
        String input = "}{";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertFalse(actual);
    }
    @Test
    void isValid7() {
        String input = "{)";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertFalse(actual);
    }
    @Test
    void isValid8() {
        String input = "{{{]]]";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertFalse(actual);
    }
    @Test
    void isValid9() {
        String input = "(([]){})";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertTrue(actual);
    }
    @Test
    void isValid10() {
        String input = "[])";
        Q20_ValidParenthesses q20_validParenthesses = new Q20_ValidParenthesses();
        boolean actual = q20_validParenthesses.isValid(input);
        assertFalse(actual);
    }
}