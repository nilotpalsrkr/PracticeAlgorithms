package leetcode.dsa.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q881_Boats_to_Save_PeopleTest {

    @Test
    void numRescueBoats() {
        int[] people = {1,2};
        int limit = 3;

        Q881_Boats_to_Save_People q881_boats_to_save_people = new Q881_Boats_to_Save_People();
        int result = q881_boats_to_save_people.numRescueBoats(people, limit);

        assertEquals(1, result);
    }
    @Test
    void numRescueBoats1() {
        int[] people = {3,2,2,1};
        int limit = 3;

        Q881_Boats_to_Save_People q881_boats_to_save_people = new Q881_Boats_to_Save_People();
        int result = q881_boats_to_save_people.numRescueBoats(people, limit);

        assertEquals(3, result);
    }
    @Test
    void numRescueBoats2() {
        int[] people = {3,5,3,4};
        int limit = 5;

        Q881_Boats_to_Save_People q881_boats_to_save_people = new Q881_Boats_to_Save_People();
        int result = q881_boats_to_save_people.numRescueBoats(people, limit);

        assertEquals(4, result);
    }
    @Test
    void numRescueBoats3() {
        int[] people = {5,1,4,2};
        int limit = 6;

        Q881_Boats_to_Save_People q881_boats_to_save_people = new Q881_Boats_to_Save_People();
        int result = q881_boats_to_save_people.numRescueBoats(people, limit);

        assertEquals(2, result);
    }

    @Test
    void numRescueBoats4() {
        int[] people = {2,4};
        int limit = 5;

        Q881_Boats_to_Save_People q881_boats_to_save_people = new Q881_Boats_to_Save_People();
        int result = q881_boats_to_save_people.numRescueBoats(people, limit);

        assertEquals(2, result);
    }
    @Test
    void numRescueBoats5() {
        int[] people = {2};
        int limit = 4;

        Q881_Boats_to_Save_People q881_boats_to_save_people = new Q881_Boats_to_Save_People();
        int result = q881_boats_to_save_people.numRescueBoats(people, limit);

        assertEquals(1, result);
    }
}