package leetcode.concurrency.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q1114_Print_in_OrderTest {


    @Test
    public void test() {
        Q1114_Print_in_Order_Atomic foo = new Q1114_Print_in_Order_Atomic();



      new Thread(new Runnable() {
          @Override
          public void run() {
              try {
                  foo.first(() -> {
                      System.out.println("First");
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
                    foo.third(() -> {
                        System.out.println("Third");
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
                    foo.second(() -> {
                        System.out.println("Second");
                    });
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}