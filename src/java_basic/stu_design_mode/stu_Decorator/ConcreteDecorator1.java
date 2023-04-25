package java_basic.stu_design_mode.stu_Decorator;
//具体装饰角色
public class ConcreteDecorator1 extends Decorator {
    ConcreteDecorator1(Component component) {
        super(component);
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
