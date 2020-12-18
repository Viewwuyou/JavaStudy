package com.viewwuyou.java.DesignPattern.factory;

public class CourseFactory {
    /**
     * 简单的工厂创建方式，通过简单的字符串判断新建类并返回，如此带来的影响就是一旦未来增加需求，该函数需要修改
     * @param name 需要的课程类型
     * @return 返回根据字符串参数创建的类
     */
    public ICourse createByString(String name) {
        if (name.equals("java")) {
            return new JavaCourse();
        }
        else if (name.equals("python")) {
            return new PythonCourse();
        }
        else {
            return null;
        }
    }

    /**
     * 通过反射方式创建的类，是反射方法中最容易想到和利用的一种，具有较好的扩展性，未来无需修改此方法
     * 但是由于传入的参数仍然是字符串，且调用者需要添加类全路径，因此此种方法不太好，调用起来过于麻烦
     * @param className 传入的需要生成的类的名称
     * @return 返回生成的类
     */
    public ICourse createByReflectAndString(String className) {
        try {
            if (!(className == null || className.equals("")))
            {
                return (ICourse) Class.forName(className).getDeclaredConstructor().newInstance();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 根据传入的类的class对象通过反射创建对象，该方法克服了以上两种方法的缺点，是最优解
     * @param clazz 传入的类对象
     * @return 根据传入的类对象返回的对象
     */
    public ICourse createByReflectAndClass(Class<? extends ICourse> clazz) {
        try {
            if (clazz != null) {
                return clazz.getDeclaredConstructor().newInstance();
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
