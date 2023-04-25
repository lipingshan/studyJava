package java_basic.stu_design_mode.restu.结构型模式.适配器模式.类适配器;

public class Adapter extends Adaptee220v implements Target{
    //优点：由于是直接集成Adaptee220v，因此可以直接重写Adaptee220v的方法。
    //缺点：单继承限制。
    @Override
    public void output5v() {
        this.v = this.v/44;
        this.output220v();
    }
}
