package com.viewwuyou.java.mutiThread.syn;

public class AccountTest {

    public static void main(String[] args) {
        AccountSyn account = new AccountSyn("123456", 1000);

        new Thread(new DrawAccount(account, 800), "甲").start();
        new Thread(new DrawAccount(account, 800), "乙").start();
    }

}
