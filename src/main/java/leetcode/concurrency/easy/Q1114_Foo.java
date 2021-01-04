package leetcode.concurrency.easy;

import java.util.concurrent.atomic.AtomicInteger;

public class Q1114_Foo {

        private final AtomicInteger i = new AtomicInteger();
        private final Object lock = new Object();

        public Q1114_Foo() {
            i.set(0);
        }

        public void first(Runnable printFirst) throws InterruptedException {
            synchronized (lock) {
                while (i.get() != 0) {
                    lock.wait();
                }
                printFirst.run();
                i.set(1);
                lock.notifyAll();
            }
        }

        public void second(Runnable printSecond) throws InterruptedException {
            synchronized (lock) {
                while (i.get() != 1) {
                    lock.wait();
                }
                printSecond.run();
                i.set(2);
                lock.notifyAll();
            }
        }

        public void third(Runnable printThird) throws InterruptedException {
            synchronized (lock) {
                while (i.get() != 2) {
                    lock.wait();
                }
                printThird.run();
                i.set(3);
            }
        }

}
