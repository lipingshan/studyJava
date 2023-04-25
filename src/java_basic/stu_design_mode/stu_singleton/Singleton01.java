package java_basic.stu_design_mode.stu_singleton;

import lombok.Data;

//懒加载(多线程安全)  双重检验
@Data
public class Singleton01 {
    private String name;
    private int age;
    //step1 声明一个volatile static 的Singleton01
    private volatile static Singleton01 singleton01;

    //step2 私有的构造函数
    private Singleton01(){

    }

    //step3 一个对外获取实例的方法
    public static Singleton01 getInstance(){
        if(singleton01==null){
            synchronized (Object.class){
                if(singleton01==null){
                    singleton01=new Singleton01();
                }
            }
        }
        return singleton01;
    }
}
