package other.general;

import java.util.Objects;

public class HashFunction {
    public static void main(String[] args) {
        System.out.println(hashof(100));
        System.out.println(hashof(200));
        System.out.println(hashof(300));
    }
    private static int hashof(Integer i) {
        return Objects.hashCode(i);
    }
}
