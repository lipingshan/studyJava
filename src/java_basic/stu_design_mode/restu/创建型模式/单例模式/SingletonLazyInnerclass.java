package java_basic.stu_design_mode.restu.创建型模式.单例模式;

import lombok.Data;

//懒汉模式内部类
@Data
public class SingletonLazyInnerclass {
    private String name;
    private int age;
    private SingletonLazyInnerclass(){};
    private static class  innerclass{
        private static final SingletonLazyInnerclass singletonLazyInnerclass = new SingletonLazyInnerclass();
    }
    public static SingletonLazyInnerclass getInstance(){
        return innerclass.singletonLazyInnerclass;
    }

}
