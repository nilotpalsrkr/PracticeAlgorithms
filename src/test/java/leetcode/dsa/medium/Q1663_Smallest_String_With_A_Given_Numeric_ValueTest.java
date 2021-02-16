package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1663_Smallest_String_With_A_Given_Numeric_ValueTest {

    @Test
    void getSmallestString() {
        Q1663_Smallest_String_With_A_Given_Numeric_Value q1663_smallest_string_with_a_given_numeric_value = new Q1663_Smallest_String_With_A_Given_Numeric_Value();
        String result = q1663_smallest_string_with_a_given_numeric_value.getSmallestString(3, 27);
        assertEquals("aay", result);
    }
}