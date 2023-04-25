package java_basic.stu_design_mode.stu_Decorator.cello1;

import java_basic.stu_design_mode.stu_Decorator.ConcreteComponent;

public class ConcreteDecorator1 extends Decorator {
    ConcreteDecorator1(ConcreteComponent concreteComponent) {
        super(concreteComponent);
    }

    @Override
    public void operation() {
        super.operation();
        addFunctionZero();
    }

    public void addFunctionZero(){
        System.out.println("this is add one method");
    }

}
