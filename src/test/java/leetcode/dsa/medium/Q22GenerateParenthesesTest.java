package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q22GenerateParenthesesTest {

    @Test
    void generateParenthesis1() {
        int input = 3;
        Q22GenerateParentheses q22GenerateParentheses = new Q22GenerateParentheses();
        List<String> actual = q22GenerateParentheses.generateParenthesis(input);
        assertEquals(5, actual.size());
    }
    @Test
    void generateParenthesis2() {
        int input = 1;
        Q22GenerateParentheses q22GenerateParentheses = new Q22GenerateParentheses();
        List<String> actual = q22GenerateParentheses.generateParenthesis(input);
        assertEquals(1, actual.size());
    }
    @Test
    void generateParenthesis3() {
        int input = 2;
        Q22GenerateParentheses q22GenerateParentheses = new Q22GenerateParentheses();
        List<String> actual = q22GenerateParentheses.generateParenthesis(input);
        assertEquals(2, actual.size());
    }
}