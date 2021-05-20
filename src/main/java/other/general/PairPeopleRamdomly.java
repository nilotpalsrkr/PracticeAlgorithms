package other.general;

import java.util.*;

public class PairPeopleRamdomly {
    public List<Pair> shuffle(String[] strings) {
    List<Pair> pairs = new ArrayList<>();
        for(int i = 0; i < strings.length; i=i+2) {
            try {
                pairs.add(pairUp(strings[i], strings[i+1]));
            }catch (IndexOutOfBoundsException e) {
                pairs.add(new Pair(strings[i]));
            }
        }
        return pairs;
    }

    public List<Pair> shuffle2(String[] strings) {

        List<Pair> pairs = new ArrayList<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i<= strings.length/2; i++) {
            int pairFirstIndex = i;
            int pairSecondIndex = i + 4;
            try {
                if(!set.contains(strings[i])) {
                    pairs.add(pairUp(strings[pairFirstIndex], strings[pairSecondIndex]));
                    set.add(strings[pairFirstIndex]);
                    set.add(strings[pairSecondIndex]);
                }
                else {
                    pairs.add(pairUp(strings[pairSecondIndex]));
                }
            }catch (IndexOutOfBoundsException | NullPointerException e) {
                pairs.add(pairUp(strings[i]));
            }
        }
        return pairs;
    }

    private Pair pairUp( String stringI, String stringJ) {
       return new Pair(stringI, stringJ);
    }
    private Pair pairUp( String stringJ) {
        return new Pair(stringJ, "No partner");
    }
}
class Pair {
    public String employee1;
    public String employee2;

    public Pair(String employee1, String employee2) {
        this.employee1 = employee1;
        this.employee2 = employee2;
    }

    public Pair(String employee1) {
        this.employee1 = employee1;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;
        return Objects.equals(employee2, pair.employee1) ||
                Objects.equals(employee1, pair.employee2);

    }

    @Override
    public int hashCode() {
        return Objects.hash("common");
    }

    @Override
    public String toString() {
        return "Pair{" +
                "employee1='" + employee1 + '\'' +
                ", employee2='" + employee2 + '\'' +
                '}';
    }
}

