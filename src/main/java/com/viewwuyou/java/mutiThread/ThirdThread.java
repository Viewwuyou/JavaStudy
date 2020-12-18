package com.viewwuyou.java.mutiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThirdThread {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)() -> {
            int i = 0;
            for ( ; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            return i;
        });
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20) {
                new Thread(task).start();
            }
            if (i > 20) {
                try {
                    System.out.println("ChildThread's return value: " + task.get());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
