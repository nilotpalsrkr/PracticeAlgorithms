package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q14_Longest_Common_PrefixTest {

    @Test
    void longestCommonPrefix() {
        String[] strings = {"fart","fat"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("fa",commonPrefix);
    }
    @Test
    void longestCommonPrefix1() {
        String[] strings = {"f","fat"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("f",commonPrefix);
    }
    @Test
    void longestCommonPrefix2() {
        String[] strings = {"fat","f"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("f",commonPrefix);
    }
    @Test
    void longestCommonPrefix3() {
        String[] strings = {"f","","f"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("",commonPrefix);
    }
   /* @Test
    void longestCommonPrefix4() {
        String[] strings = {null,"f"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("",commonPrefix);
    }*/
    @Test
    void longestCommonPrefix5() {
        String[] strings = {"abcdef","abc","abcd"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("abc",commonPrefix);
    }
    @Test
    void longestCommonPrefix6() {
        String[] strings = {"abcdef","abc","a"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("a",commonPrefix);
    }
    @Test
    void longestCommonPrefix7() {
        String[] strings = {"flower","flow","flight"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("fl",commonPrefix);
    }
    @Test
    void longestCommonPrefix8() {
        String[] strings = {"flower","flower","flower","flower"};
        Q14_Longest_Common_Prefix q14_longest_common_prefix = new Q14_Longest_Common_Prefix();
        String commonPrefix = q14_longest_common_prefix.longestCommonPrefix(strings);
        assertEquals("flower",commonPrefix);
    }
}