package other.general.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneNumberResolutionTest {

    @Test
    void parseDistrict() {
        String s = "237-253-3352";
        String result = PhoneNumberResolution.parseDistrict(s);
        System.out.println(result);
    }
}