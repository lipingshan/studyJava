package java_basic.stu_design_mode.restu.行为型模式.访问者模式.员工工作检查;

import java.util.Random;

//员工接口
public abstract class Staff {
    public String name;
    public int kpi;// 员工KPI

    public Staff(String name) {
        this.name = name;
        kpi = new Random().nextInt(10);
    }
    abstract void accept(Visitor visitor);
}
