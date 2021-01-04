package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;
import sun.security.util.ArrayUtil;

import static org.junit.jupiter.api.Assertions.*;

class Q1640_Check_Array_Formation_Through_ConcatenationTest {

    @Test
    void canFormArray() {
        int[] arr = {55, 88};
        int[][] peices = {{88},{55}};

        Q1640_Check_Array_Formation_Through_Concatenation q1640_check_array_formation_through_concatenation = new Q1640_Check_Array_Formation_Through_Concatenation();
        boolean result = q1640_check_array_formation_through_concatenation.canFormArray(arr, peices);

        assertEquals(true, result);

    }

    @Test
    void canFormArray1() {
        int[] arr = {49, 18, 16};
        int[][] peices = {{16,18,49}};

        Q1640_Check_Array_Formation_Through_Concatenation q1640_check_array_formation_through_concatenation = new Q1640_Check_Array_Formation_Through_Concatenation();
        boolean result = q1640_check_array_formation_through_concatenation.canFormArray(arr, peices);

        assertEquals(false, result);

    }
    @Test
    void canFormArray2() {
        int[] arr = {91,4,64,78};
        int[][] peices = {{78},{4,64},{91}};

        Q1640_Check_Array_Formation_Through_Concatenation q1640_check_array_formation_through_concatenation = new Q1640_Check_Array_Formation_Through_Concatenation();
        boolean result = q1640_check_array_formation_through_concatenation.canFormArray(arr, peices);

        assertEquals(true, result);

    }
}