package leetcode.concurrency.medium;

import java.util.concurrent.atomic.AtomicBoolean;

public class Q1115_Print_FooBar_Alternately {
    private int n;
    AtomicBoolean acquire;
    private Object lock = new Object();
    public Q1115_Print_FooBar_Alternately(int n) {
        this.n = n;
        acquire = new AtomicBoolean(false);
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while(acquire.get() == true) {

            }
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                acquire.compareAndSet(false,true);
            }

    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
           while(acquire.get() == false) {

           }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            acquire.compareAndSet(true, false);
        }
        }

}
