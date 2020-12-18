package com.viewwuyou.java.mutiThread.syn;

public class DrawAccount implements Runnable {
    private AccountSyn account;

    private double drawAmount;


    public DrawAccount(AccountSyn account, double drawAmount) {
        this.account = account;
        this.drawAmount = drawAmount;
    }

    @Override
    public void run() {
        /*
        synchronized (Account.class) {
            if (account.getBalance() >= drawAmount) {
                System.out.println(Thread.currentThread().getName() + "取钱成功！吐出钞票：" + drawAmount);

                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                account.setBalance(account.getBalance() - drawAmount);
                System.out.println("\t余额为：" + account.getBalance());

            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败，余额不足");
            }
        }
         */
        account.draw(drawAmount);
    }
}
