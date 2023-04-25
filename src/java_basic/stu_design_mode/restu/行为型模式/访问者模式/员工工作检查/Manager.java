package java_basic.stu_design_mode.restu.行为型模式.访问者模式.员工工作检查;

import java.util.Random;

public class Manager extends Staff{
    public Manager(String name) {
        super(name);
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    // 一年做的产品数量
    public int getProducts() {
        return new Random().nextInt(10);
    }
}
