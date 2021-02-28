package leetcode.dsa.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q32_Longest_Valid_ParenthesesTest {

    @Test
    void longestValidParentheses() {
        String s = "(()";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(2, result);
    }
    @Test
    void longestValidParentheses2() {
        String s = ")()())";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(4, result);
    }
    @Test
    void longestValidParentheses3() {
        String s = "";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(0, result);
    }

    @Test
    void longestValidParentheses4() {
        String s = "())";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(2, result);
    }
    @Test
    void longestValidParentheses5() {
        String s = "))";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(0, result);
    }
    @Test
    void longestValidParentheses6() {
        String s = "((";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(0, result);
    }
    @Test
    void longestValidParentheses7() {
        String s = ")";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(0, result);
    }
    @Test
    void longestValidParentheses8() {
        String s = "(";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(0, result);
    }
    @Test
    void longestValidParentheses9() {
        String s = "()()";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(4, result);
    }

    @Test
    void longestValidParentheses10() {
        String s = "()(())";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(6, result);
    }

    @Test
    void longestValidParentheses11() {
        String s = "(()())";
        Q32_Longest_Valid_Parentheses q32_longest_valid_parentheses = new Q32_Longest_Valid_Parentheses();
        int result = q32_longest_valid_parentheses.longestValidParentheses(s);
        assertEquals(6, result);
    }
}