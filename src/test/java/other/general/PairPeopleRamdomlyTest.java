package other.general;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairPeopleRamdomlyTest {

    @Test
    void shuffle() {
        String[] employees = new String[] {"A","B","C","D","E"};
        PairPeopleRamdomly pairPeopleRamdomly = new PairPeopleRamdomly();
        pairPeopleRamdomly.shuffle2(employees).stream().forEach(x -> System.out.println(x));
    }
}