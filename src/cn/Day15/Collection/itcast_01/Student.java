package cn.Day15.Collection.itcast_01;

/**
 * Created by Searis on 2016/3/14.
 */
public class Student {
    private String name;
    private int age;

    //���췽��
    public Student() {
        super();
    }

    public String getName() {
        return name;

    }

    public int getAge() {
        return age;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
