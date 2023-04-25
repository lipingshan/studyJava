package java_basic.stu_design_mode.stu_Decorator.cello1;

import java_basic.stu_design_mode.stu_Decorator.ConcreteComponent;
import org.junit.Test;

public class Main {
    @Test
    public void method() {
        //具体构件
        ConcreteComponent concreteComponent = new ConcreteComponent();
        //具体装饰
        Decorator decorator = new ConcreteDecorator(concreteComponent);
        decorator.operation();
        System.out.println("******************************************");

        Decorator decorator1 = new ConcreteDecorator1(decorator);
        decorator1.operation();
    }
}
