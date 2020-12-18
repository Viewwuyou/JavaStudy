package com.viewwuyou.java.mutiThread;

public class SecondThread {
    private static int i = 0;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new Thread(() -> {
                    for ( ; SecondThread.i < 100; SecondThread.i++ ) {
                        System.out.println(Thread.currentThread().getName() + " " + SecondThread.i);
                    }
                }, "New Thread 1").start();

                new Thread(() -> {
                    for ( ; SecondThread.i < 100; SecondThread.i++ ) {
                        System.out.println(Thread.currentThread().getName() + " " + SecondThread.i);
                    }
                }, "New Thread 2").start();
            }
        }
    }
}
