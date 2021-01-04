package leetcode.concurrency.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1115_Print_FooBar_AlternatelyTest {

    @Test
    public void test() {
        Q1115_Print_FooBar_Alternately q1115_print_fooBar_alternately = new Q1115_Print_FooBar_Alternately(20);

       new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    q1115_print_fooBar_alternately.bar(() -> {
                        System.out.print("bar");
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    q1115_print_fooBar_alternately.foo(() -> {
                        System.out.print("foo");
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}