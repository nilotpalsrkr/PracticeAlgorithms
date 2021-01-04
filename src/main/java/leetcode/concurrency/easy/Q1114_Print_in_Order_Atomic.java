package leetcode.concurrency.easy;

import java.util.concurrent.atomic.AtomicBoolean;

public class Q1114_Print_in_Order_Atomic {

   AtomicBoolean aBoolean = new AtomicBoolean(false);
   AtomicBoolean bBoolean = new AtomicBoolean(false);



    public Q1114_Print_in_Order_Atomic() {

    }

    public void first(Runnable printFirst) throws InterruptedException {

        printFirst.run();
        aBoolean.set(true);

    }

    public void second(Runnable printSecond) throws InterruptedException {
        while(aBoolean.get()==false) {

        }

        printSecond.run();
        bBoolean.set(true);

       }


    public void third(Runnable printThird) throws InterruptedException {
        while(bBoolean.get()==false) {}

        printThird.run();

    }

}
