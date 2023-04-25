package java_basic.stu_design_mode.stu_Decorator;

import org.junit.Test;

public class Main {
    @Test
    public void method() {
        //被装饰类
        Component concreteComponent = new ConcreteComponent();

        Component concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operation();

        System.out.println("******************************************");

        Component concreteDecorator1 = new ConcreteDecorator1(concreteDecorator);
        concreteDecorator1.operation();
        System.out.println("******************************************");
    }
}
