package com.viewwuyou.java.DesignPattern.factory.abstractFactory;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("Record Python video");
    }
}
