package com.viewwuyou.java.DesignPattern.factory.abstractFactory;

public interface CourseFactory {
    INote createNote();
    IVideo createVideo();
}
