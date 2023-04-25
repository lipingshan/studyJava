package java_basic.javaIO.stu01流的初步认识.stu09对象流;

import java.io.Serializable;

public class Person implements Serializable {
    // 曾经对对象进行序列化到文件中
    // 由于需求 需要对对象的类添加新属性
    // 然后在反序列化会失败，如果没有版本号
    private static final long serialVersionUID = 1210686073575631500L;
    private String name;
    transient private int age; // transient 表示不需要序列化的属性


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}