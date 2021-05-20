package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q500_Keyboard_RowTest {

    @Test
    void findWords() {
        String[] strings = {"Hello","Alaska","Dad","Peace"};
        Q500_Keyboard_Row q500_keyboard_row = new Q500_Keyboard_Row();
        String[] result = q500_keyboard_row.findWords(strings);
        assertEquals(2, result.length);
    }
}