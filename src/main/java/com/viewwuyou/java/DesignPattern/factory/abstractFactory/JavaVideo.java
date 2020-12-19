package com.viewwuyou.java.DesignPattern.factory.abstractFactory;

public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("Record Java video.");
    }
}
