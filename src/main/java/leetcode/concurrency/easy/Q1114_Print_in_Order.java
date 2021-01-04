package leetcode.concurrency.easy;

public class Q1114_Print_in_Order {

    Integer i = 1;
    Object lock = new Object();
    public Q1114_Print_in_Order() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        synchronized (lock) {
            while(i % 3 != 1) {

                lock.wait();
            }
                printFirst.run();
                i++;
                lock.notifyAll();

        }

    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
       synchronized (lock) {
           while (i % 3 != 2) {
               lock.wait();
           }
               printSecond.run();
               i++;
               lock.notifyAll();
           }
       }


    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        synchronized (lock) {
            while (i % 3 != 0) {
                lock.wait();
            }
                printThird.run();
                i++;
                lock.notifyAll();
            }
        }

}
