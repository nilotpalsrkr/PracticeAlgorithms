package other.general;

public class StringOperations {
    public void f(String s) {
        System.out.println(s.getBytes());
        System.out.println(new String(s.getBytes()));
    }
}
