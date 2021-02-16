package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q984_String_Without_AAA_or_BBBTest {

    @Test
    void strWithout3a3b() {
        Q984_String_Without_AAA_or_BBB q984_string_without_aaa_or_bbb = new Q984_String_Without_AAA_or_BBB();
        String result = q984_string_without_aaa_or_bbb.strWithout3a3b(4,1);
        System.out.println(result);
    }
    @Test
    void strWithout3a3b2() {
        Q984_String_Without_AAA_or_BBB q984_string_without_aaa_or_bbb = new Q984_String_Without_AAA_or_BBB();
        String result = q984_string_without_aaa_or_bbb.strWithout3a3b(1,2);
        System.out.println(result);
    }
    @Test
    void strWithout3a3b23() {
        Q984_String_Without_AAA_or_BBB q984_string_without_aaa_or_bbb = new Q984_String_Without_AAA_or_BBB();
        String result = q984_string_without_aaa_or_bbb.strWithout3a3b(0,1);
        System.out.println(result);
    }
    @Test
    void strWithout3a3b24() {
        Q984_String_Without_AAA_or_BBB q984_string_without_aaa_or_bbb = new Q984_String_Without_AAA_or_BBB();
        String result = q984_string_without_aaa_or_bbb.strWithout3a3b(7,4);
        System.out.println(result);
    }
    @Test
    void strWithout3a3b25() {
        Q984_String_Without_AAA_or_BBB q984_string_without_aaa_or_bbb = new Q984_String_Without_AAA_or_BBB();
        String result = q984_string_without_aaa_or_bbb.strWithout3a3b(0,0);
        System.out.println(result);
    }
    @Test
    void strWithout3a3b26() {
        Q984_String_Without_AAA_or_BBB q984_string_without_aaa_or_bbb = new Q984_String_Without_AAA_or_BBB();
        String result = q984_string_without_aaa_or_bbb.strWithout3a3b(1,3);
        System.out.println(result);
    }
}