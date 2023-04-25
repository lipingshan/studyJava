package java_basic.stu_design_mode.restu.结构型模式.适配器模式.对象适配器;

import java_basic.stu_design_mode.restu.结构型模式.适配器模式.类适配器.Adaptee220v;
import java_basic.stu_design_mode.restu.结构型模式.适配器模式.类适配器.Target;

public class Main {
    public static void main(String[] args) {
        Target target = new AdapterObj(new Adaptee220v());
        target.output5v();
    }
}
