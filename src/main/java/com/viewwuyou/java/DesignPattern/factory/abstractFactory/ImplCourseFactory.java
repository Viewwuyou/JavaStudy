package com.viewwuyou.java.DesignPattern.factory.abstractFactory;

public class ImplCourseFactory implements CourseFactory {

    private final String string;

    public ImplCourseFactory(String string) {
        this.string = string;
    }

    private String UpperFirstChar(String string) {
        char[] cs = string.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }

    private String createClassName(String string, String suffix){
        return UpperFirstChar(string.toLowerCase()) + UpperFirstChar(suffix.toLowerCase());
    }

    @Override
    public IVideo createVideo() {
        String className = createClassName(string, "video");
        try {
            return (IVideo) Class.forName(className).getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public INote createNote() {
        String className = createClassName(string, "note");
        try {
            return (INote) Class.forName(className).getDeclaredConstructor().newInstance();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
