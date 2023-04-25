package java_basic.stu_design_mode.stu_Decorator;
//抽象装饰角色
public abstract class Decorator implements Component {
    private  Component component;
    Decorator( Component component){
        this.component = component;
    }

    @Override
    public void operation() {
       component.operation();
    }
}
