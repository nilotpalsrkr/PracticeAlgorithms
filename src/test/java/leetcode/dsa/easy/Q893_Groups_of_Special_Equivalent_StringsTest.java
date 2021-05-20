package leetcode.dsa.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q893_Groups_of_Special_Equivalent_StringsTest {

    @Test
    void numSpecialEquivGroups() {
        String[] strings = {"abcd","cdab","cbad","xyzz","zzxy","zzyx"};
        Q893_Groups_of_Special_Equivalent_Strings q893_groups_of_special_equivalent_strings = new Q893_Groups_of_Special_Equivalent_Strings();
        Integer result = q893_groups_of_special_equivalent_strings.numSpecialEquivGroups(strings);
        assertEquals(3, result);
    }
}