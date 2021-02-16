package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1249_Minimum_Remove_to_Make_Valid_ParenthesesTest {

    @Test
    void minRemoveToMakeValid() {
        String s = "lee(t(c)o)de)";
        Q1249_Minimum_Remove_to_Make_Valid_Parentheses q1249_minimum_remove_to_make_valid_parentheses = new Q1249_Minimum_Remove_to_Make_Valid_Parentheses();
        String result = q1249_minimum_remove_to_make_valid_parentheses.minRemoveToMakeValid(s);
        System.out.println(result);
    }
    @Test
    void minRemoveToMakeValid1() {
        String s = "a)b(c)d";
        Q1249_Minimum_Remove_to_Make_Valid_Parentheses q1249_minimum_remove_to_make_valid_parentheses = new Q1249_Minimum_Remove_to_Make_Valid_Parentheses();
        String result = q1249_minimum_remove_to_make_valid_parentheses.minRemoveToMakeValid(s);
        System.out.println(result);
    }
    @Test
    void minRemoveToMakeValid2() {
        String s = "))((";
        Q1249_Minimum_Remove_to_Make_Valid_Parentheses q1249_minimum_remove_to_make_valid_parentheses = new Q1249_Minimum_Remove_to_Make_Valid_Parentheses();
        String result = q1249_minimum_remove_to_make_valid_parentheses.minRemoveToMakeValid(s);
        System.out.println(result);
    }
    @Test
    void minRemoveToMakeValid3() {
        String s = "(a(b(c)d)";
        Q1249_Minimum_Remove_to_Make_Valid_Parentheses q1249_minimum_remove_to_make_valid_parentheses = new Q1249_Minimum_Remove_to_Make_Valid_Parentheses();
        String result = q1249_minimum_remove_to_make_valid_parentheses.minRemoveToMakeValid(s);
        System.out.println(result);
    }
}