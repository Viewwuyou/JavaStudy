package com.viewwuyou.java.mutiThread;

public class FirstThread extends Thread {

    private static int i = 0;

    @Override
    public void run() {
        for ( ; i < 100; i++) {
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);

            if (i == 20) {
                new FirstThread().start();
                new FirstThread().start();
            }
        }
    }
}
