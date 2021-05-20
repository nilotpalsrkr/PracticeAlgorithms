package leetcode.dsa.easy;

import leetcode.dsa.medium.Q526_Beautiful_Arrangement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q520_Detect_CapitalTest {

    @Test
    void detectCapitalUse() {
        String s = "USA";

        Q520_Detect_Capital q520_detect_capital = new Q520_Detect_Capital();
        boolean result = q520_detect_capital.detectCapitalUse(s);

        assertEquals(Boolean.TRUE, result);
    }
    @Test
    void detectCapitalUse1() {
        String s = "leetcode";

        Q520_Detect_Capital q520_detect_capital = new Q520_Detect_Capital();
        boolean result = q520_detect_capital.detectCapitalUse(s);

        assertEquals(Boolean.TRUE, result);
    }
    @Test
    void detectCapitalUse2() {
        String s = "Google";

        Q520_Detect_Capital q520_detect_capital = new Q520_Detect_Capital();
        boolean result = q520_detect_capital.detectCapitalUse(s);

        assertEquals(Boolean.TRUE, result);
    }
    @Test
    void detectCapitalUse3() {
        String s = "USa";

        Q520_Detect_Capital q520_detect_capital = new Q520_Detect_Capital();
        boolean result = q520_detect_capital.detectCapitalUse(s);

        assertEquals(Boolean.FALSE, result);
    }
    @Test
    void detectCapitalUse4() {
        String s = "uSA";

        Q520_Detect_Capital q520_detect_capital = new Q520_Detect_Capital();
        boolean result = q520_detect_capital.detectCapitalUse(s);

        assertEquals(Boolean.FALSE, result);
    }
}