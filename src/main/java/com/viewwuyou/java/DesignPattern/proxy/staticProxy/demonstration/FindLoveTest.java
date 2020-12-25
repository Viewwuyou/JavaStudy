package com.viewwuyou.java.DesignPattern.proxy.staticProxy.demonstration;

public class FindLoveTest {
    public static void main(String[] args) {
        // 用父亲完成了代理，但是这里父亲只能对儿子进行代理，一但需求改变，需要重写Father这个类
        Father father = new Father(new Son());
        father.findLove();
    }
}
