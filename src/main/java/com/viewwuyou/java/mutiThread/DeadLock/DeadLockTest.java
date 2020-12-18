package com.viewwuyou.java.mutiThread.DeadLock;

public class DeadLockTest {
    public static void main(String[] args) {
        new Thread(new DeadLock(true), "线程1").start();
        new Thread(new DeadLock(false), "线程2").start();
    }
}
