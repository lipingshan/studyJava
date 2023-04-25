package java_basic.stu_design_mode.stu_Decorator;
//具体构件  被装饰的对象
public class ConcreteComponent implements Component{
    @Override
    public void operation() {
        System.out.println("具体构件");
    }
}
