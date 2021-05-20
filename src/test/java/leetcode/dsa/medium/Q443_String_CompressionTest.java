package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q443_String_CompressionTest {

    @Test
    void compress() {
        char[] chars = new char[]{'a','a','b','b','c','c','c'};
        Q443_String_Compression q443_string_compression = new Q443_String_Compression();
        int length = q443_string_compression.compress(chars);
        assertEquals(6, length);
    }
    @Test
    void compress1() {
        char[] chars = new char[]{'a'};
        Q443_String_Compression q443_string_compression = new Q443_String_Compression();
        int length = q443_string_compression.compress(chars);
        assertEquals(1, length);
    }
    @Test
    void compress2() {
        String s = "aaabbaa";
        Q443_String_Compression q443_string_compression = new Q443_String_Compression();
        int length = q443_string_compression.compress(s.toCharArray());
        assertEquals(6, length);
    }
    @Test
    void compress3() {
        String s = "abbbbbbbbbbbb";
        Q443_String_Compression q443_string_compression = new Q443_String_Compression();
        char[] chars = s.toCharArray();
        int length = q443_string_compression.compress(chars);
        assertEquals(4, length);
    }
}