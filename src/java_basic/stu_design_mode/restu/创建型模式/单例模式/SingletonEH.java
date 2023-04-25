package java_basic.stu_design_mode.restu.创建型模式.单例模式;

import lombok.Data;

//饿汉模式 并发安全
@Data
public class SingletonEH {
    private String name;
    private int age;
    private static SingletonEH singletonEH = new SingletonEH();
    private SingletonEH(){};
    public static SingletonEH getInstance(){
        return singletonEH;
    }
}
