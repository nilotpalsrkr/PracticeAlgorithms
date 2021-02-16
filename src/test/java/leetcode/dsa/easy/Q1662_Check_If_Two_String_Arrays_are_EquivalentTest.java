package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1662_Check_If_Two_String_Arrays_are_EquivalentTest {

    @Test
    void arrayStringsAreEqual() {
        String[] stringArr1 = {"abc","def"};
        String[] stringArr2 = {"a","bcde","f"};

        Q1662_Check_If_Two_String_Arrays_are_Equivalent q1662_check_if_two_string_arrays_are_equivalent = new Q1662_Check_If_Two_String_Arrays_are_Equivalent();
        boolean result = q1662_check_if_two_string_arrays_are_equivalent.arrayStringsAreEqual(stringArr1, stringArr2);
        assertEquals(true, result);
    }
}