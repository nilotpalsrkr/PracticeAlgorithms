package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1649_Create_Sorted_Array_through_InstructionsTest {

    @Test
    void createSortedArray() {
        int[] instructions = {1,5,6,2};
        Q1649_Create_Sorted_Array_through_Instructions q1649_create_sorted_array_through_instructions = new Q1649_Create_Sorted_Array_through_Instructions();
        int result = q1649_create_sorted_array_through_instructions.createSortedArray(instructions);
        assertEquals(1, result);
    }
}