package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q401_Binary_WatchTest {

    @Test
    void readBinaryWatch1() {
        Q401_Binary_Watch q401_binary_watch = new Q401_Binary_Watch();
        List<String> result = q401_binary_watch.readBinaryWatch(1);
        System.out.println(result);
        assertEquals(10, result.size());
    }
}