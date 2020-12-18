package com.viewwuyou.java.mutiThread.syn;

import java.util.Objects;

public class AccountSyn {

    private String accountNo;
    private double balance;

    public AccountSyn() {}
    public AccountSyn(String accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public double getBalance() {
        return balance;
    }

    // 由于余额不应该直接被修改，因此不提供直接修改余额的方法，而是采取一定的处理和包装。

    public synchronized void draw(double drawAccount) {
        if (balance >= drawAccount) {
            System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAccount);
            try {
                Thread.sleep(1);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= drawAccount;
            System.out.println("\t余额为：" + balance);
        }
        else {
            System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足。");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == Account.class) {
            Account target = (Account)obj;
            return target.getAccountNo().equals(accountNo);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return accountNo.hashCode();
    }
}
