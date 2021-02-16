package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q161_One_Edit_DistanceTest {

    @Test
    void isOneEditDistance() {
    String s = "aep";
    String t = "ap";

    Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
    boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
    assertEquals(true, result);
    }
    @Test
    void isOneEditDistance2() {
        String s = "aeep";
        String t = "ap";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(false, result);
    }
    @Test
    void isOneEditDistance4() {
        String s = "";
        String t = "a";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }
    @Test
    void isOneEditDistance3() {
        String s = "";
        String t = "ap";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(false, result);
    }

    @Test
    void isOneEditDistance5() {
        String s = "atp";
        String t = "tp";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }

    @Test
    void isOneEditDistance6() {
        String s = "atp";
        String t = "gtp";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }
    @Test
    void isOneEditDistance7() {
        String s = "ab";
        String t = "acb";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }
    @Test
    void isOneEditDistance8() {
        String s = "a";
        String t = "";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }
    @Test
    void isOneEditDistance9() {
        String s = "a";
        String t = "ac";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }
    @Test
    void isOneEditDistance19() {
        String s = "ad";
        String t = "ac";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }
    @Test
    void isOneEditDistance10() {
        String s = "adp";
        String t = "ac";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(false, result);
    }
    @Test
    void isOneEditDistance11() {
        String s = "";
        String t = "ac";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(false, result);
    }
    @Test
    void isOneEditDistance12() {
        String s = "ba";
        String t = "ab";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(false, result);
    }
    @Test
    void isOneEditDistance13() {
        String s = "aa";
        String t = "ba";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }
    @Test
    void isOneEditDistance14() {
        String s = "ab";
        String t = "aeb";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }

    @Test
    void isOneEditDistance15() {
        String s = "";
        String t = "";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(false, result);
    }

    @Test
    void isOneEditDistance16() {
        String s = "a";
        String t = "a";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(false, result);
    }
    @Test
    void isOneEditDistance17() {
        String s = "ac";
        String t = "a";

        Q161_One_Edit_Distance q161_one_edit_distance = new Q161_One_Edit_Distance();
        boolean result = q161_one_edit_distance.isOneEditDistance(s, t);
        assertEquals(true, result);
    }



}