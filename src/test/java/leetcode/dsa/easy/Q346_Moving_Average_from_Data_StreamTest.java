package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q346_Moving_Average_from_Data_StreamTest {

    @Test
    void next() {
        Q346_Moving_Average_from_Data_Stream q346_moving_average_from_data_stream = new Q346_Moving_Average_from_Data_Stream(3);
        assertEquals(1,q346_moving_average_from_data_stream.next(1));
        assertEquals(5.5,q346_moving_average_from_data_stream.next(10));
        assertEquals(4.667,q346_moving_average_from_data_stream.next(3));

    }
}