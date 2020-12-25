package com.viewwuyou.java.DesignPattern.proxy.staticProxy;

public class Father {
    private Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void findLove() {
        System.out.println("我是爸爸。");
        this.son.findLove();
        System.out.println("相亲成功");
    }
}
