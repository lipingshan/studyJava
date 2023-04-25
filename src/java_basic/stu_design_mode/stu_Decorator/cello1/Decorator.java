package java_basic.stu_design_mode.stu_Decorator.cello1;

import java_basic.stu_design_mode.stu_Decorator.ConcreteComponent;

public abstract  class Decorator extends ConcreteComponent {
    private ConcreteComponent concreteComponent;
    Decorator(ConcreteComponent concreteComponent){
        this.concreteComponent = concreteComponent;
    }
    @Override
    public void operation() {
        concreteComponent.operation();
    }
}
