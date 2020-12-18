package com.viewwuyou.java.mutiThread.DeadLock;


public class DeadLock implements Runnable {
    private static final Object obj1 = new Object();
    private static final Object obj2 = new Object();
    private final boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "已经运行。");
        if (flag) {
            synchronized (obj1) {
                System.out.println(Thread.currentThread().getName() + "已经锁住了obj1");
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj2) {
                    System.out.println("1秒后，" + Thread.currentThread().getName() + "已经锁住了obj2");
                }
            }
        }
        else {
            synchronized (obj2) {
                System.out.println(Thread.currentThread().getName() + "已经锁住了obj2");
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj1) {
                    System.out.println("1秒后，" + Thread.currentThread().getName() + "已经锁住了obj1");
                }
            }
        }
    }
}
