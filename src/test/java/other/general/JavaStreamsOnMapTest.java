package other.general;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JavaStreamsOnMapTest {

    JavaStreamsOnMap javaStreamsOnMap = new JavaStreamsOnMap();


    @BeforeAll
    public static void setup() {

    }

    @Test
    void groupByKey() {
        javaStreamsOnMap.groupByKey();
    }
}