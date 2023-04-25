package java_basic.stu_design_mode.restu.创建型模式.工厂模式.简单工厂;

import lombok.Data;

@Data
public class Banana implements Fruit{
    private String name;
    private int age;
    @Override
    public void show() {
        System.out.println("this is banana");
    }
}
