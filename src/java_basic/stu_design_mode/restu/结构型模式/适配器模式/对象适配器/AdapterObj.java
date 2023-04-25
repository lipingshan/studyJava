package java_basic.stu_design_mode.restu.结构型模式.适配器模式.对象适配器;

import java_basic.stu_design_mode.restu.结构型模式.适配器模式.类适配器.Adaptee220v;
import java_basic.stu_design_mode.restu.结构型模式.适配器模式.类适配器.Target;

public class AdapterObj implements Target {
    private Adaptee220v adaptee220v ;
    AdapterObj(Adaptee220v adaptee220v){
        this.adaptee220v = adaptee220v;
    }
    @Override
    public void output5v() {
        adaptee220v.v=adaptee220v.v/44;
        adaptee220v.output220v();
    }
}
