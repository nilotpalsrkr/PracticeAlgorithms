package leetcode.concurrency.medium;

import java.util.concurrent.Semaphore;

public class Q1115_Print_FooBar_Alternately_Semaphores {
    private int n;
    Semaphore semaphoreA = new Semaphore(1);
    Semaphore semaphoreB = new Semaphore(0);

    public Q1115_Print_FooBar_Alternately_Semaphores(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreA.acquire();
                // printFoo.run() outputs "foo". Do not change or remove this line.
                printFoo.run();
                semaphoreB.release();

            }

    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphoreB.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphoreA.release();

        }

    }
}
