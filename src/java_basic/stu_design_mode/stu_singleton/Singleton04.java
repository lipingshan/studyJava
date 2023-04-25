package java_basic.stu_design_mode.stu_singleton;

import lombok.Data;

//饿汉模式(多线程安全)
@Data
public class Singleton04 {
    private String name;
    private int age;
    //step1
   private static Singleton04 singleton04 = new Singleton04();
   //step2
    private Singleton04(){}//限制方法权限
    //step3
    public static Singleton04 getInstance(){
        return singleton04;
    }
}
