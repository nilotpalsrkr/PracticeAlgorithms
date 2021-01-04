package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q17_Letter_Combinations_of_a_Phone_NumberTest {

    @Test
    void letterCombinations() {
        String digits = "23";
        Q17_Letter_Combinations_of_a_Phone_Number q17_letter_combinations_of_a_phone_number = new Q17_Letter_Combinations_of_a_Phone_Number();
        List<String> result = q17_letter_combinations_of_a_phone_number.letterCombinations(digits);
        System.out.println(result);
        assertEquals(9, result.size());
    }
    @Test
    void letterCombinations2() {
        String digits = "";
        Q17_Letter_Combinations_of_a_Phone_Number q17_letter_combinations_of_a_phone_number = new Q17_Letter_Combinations_of_a_Phone_Number();
        List<String> result = q17_letter_combinations_of_a_phone_number.letterCombinations(digits);
        System.out.println(result);
        assertEquals(0, result.size());
    }
}