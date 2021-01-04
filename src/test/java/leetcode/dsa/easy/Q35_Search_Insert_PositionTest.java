package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q35_Search_Insert_PositionTest {

    @Test
    void searchInsert() {

        int[] inputArray = {1, 3, 5, 6};
        int target = 5;
        Q35_Search_Insert_Position  q35_search_insert_position = new Q35_Search_Insert_Position();
        int output = q35_search_insert_position.searchInsert(inputArray, target);
        assertEquals(2, output);
    }
    @Test
    void searchInsert1() {

        int[] inputArray = {1, 3, 5, 6};
        int target = 2;
        Q35_Search_Insert_Position  q35_search_insert_position = new Q35_Search_Insert_Position();
        int output = q35_search_insert_position.searchInsert(inputArray, target);
        assertEquals(1, output);
    }
    @Test
    void searchInsert2() {

        int[] inputArray = {1, 3, 5, 6};
        int target = 7;
        Q35_Search_Insert_Position  q35_search_insert_position = new Q35_Search_Insert_Position();
        int output = q35_search_insert_position.searchInsert(inputArray, target);
        assertEquals(4, output);
    }
    @Test
    void searchInsert3() {

        int[] inputArray = {1, 3, 5, 6};
        int target = 0;
        Q35_Search_Insert_Position  q35_search_insert_position = new Q35_Search_Insert_Position();
        int output = q35_search_insert_position.searchInsert(inputArray, target);
        assertEquals(0, output);
    }
    @Test
    void searchInsert4() {

        int[] inputArray = {1};
        int target = 1;
        Q35_Search_Insert_Position  q35_search_insert_position = new Q35_Search_Insert_Position();
        int output = q35_search_insert_position.searchInsert(inputArray, target);
        assertEquals(0, output);
    }
    @Test
    void searchInsert5() {

        int[] inputArray = {1,3};
        int target = 0;
        Q35_Search_Insert_Position  q35_search_insert_position = new Q35_Search_Insert_Position();
        int output = q35_search_insert_position.searchInsert(inputArray, target);
        assertEquals(0, output);
    }
}