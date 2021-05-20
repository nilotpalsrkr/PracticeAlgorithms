package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1525_Number_of_Good_Ways_to_Split_a_StringTest {

    @Test
    void numSplits() {
        String s = "aacaba";
        Q1525_Number_of_Good_Ways_to_Split_a_String q1525_number_of_good_ways_to_split_a_string = new Q1525_Number_of_Good_Ways_to_Split_a_String();
        int result = q1525_number_of_good_ways_to_split_a_string.numSplits(s);
        assertEquals(2, result);
    }

    @Test
    void numSplits1() {
        String s = "aaaaa";
        Q1525_Number_of_Good_Ways_to_Split_a_String q1525_number_of_good_ways_to_split_a_string = new Q1525_Number_of_Good_Ways_to_Split_a_String();
        int result = q1525_number_of_good_ways_to_split_a_string.numSplits(s);
        assertEquals(4, result);
    }
    @Test
    void numSplits2() {
        String s = "acbadbaada";
        Q1525_Number_of_Good_Ways_to_Split_a_String q1525_number_of_good_ways_to_split_a_string = new Q1525_Number_of_Good_Ways_to_Split_a_String();
        int result = q1525_number_of_good_ways_to_split_a_string.numSplits(s);
        assertEquals(2, result);
    }
}