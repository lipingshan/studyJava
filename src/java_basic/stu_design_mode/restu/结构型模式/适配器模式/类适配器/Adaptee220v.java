package java_basic.stu_design_mode.restu.结构型模式.适配器模式.类适配器;

public class Adaptee220v {
    public int v=220;
    public int output220v(){
        System.out.println("输出"+v+"v电压。");
        return v;
    }
}
