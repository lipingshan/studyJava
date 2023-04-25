package java_basic.stu_design_mode.restu.创建型模式.单例模式;

import lombok.Data;

// 懒加载 双重检验
@Data
public class SingletonLazyDoubleCheck {
    private String name;
    private int age;
    private static volatile SingletonLazyDoubleCheck singletonLazyDoubleCheck;
    private SingletonLazyDoubleCheck(){};
    public static SingletonLazyDoubleCheck getInstance(){
        if(singletonLazyDoubleCheck==null){
            synchronized(Object.class){
                if(singletonLazyDoubleCheck==null){
                    singletonLazyDoubleCheck = new SingletonLazyDoubleCheck();
                }
            }
        }

        return singletonLazyDoubleCheck;
    }
}
