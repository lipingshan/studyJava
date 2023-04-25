package java_basic.stu_design_mode.stu_singleton;

import lombok.Data;

//懒加载(多线程安全)  静态内部类的方法实现
@Data
public class Singleton02 {
    private String name;
    private int age;
    //step1
    private Singleton02(){

    }
    //step2 静态内部类
    private static class inner{
        private static final Singleton02 singleton02 = new Singleton02();//final 保证指针地址不变
    }

    public static Singleton02 getInstance(){
        return inner.singleton02;
    }
}
