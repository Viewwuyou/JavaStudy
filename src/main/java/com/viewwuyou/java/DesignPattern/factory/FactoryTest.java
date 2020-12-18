package com.viewwuyou.java.DesignPattern.factory;

public class FactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse iCourse = factory.createByReflectAndClass(JavaCourse.class);
        iCourse.record();
    }
}
