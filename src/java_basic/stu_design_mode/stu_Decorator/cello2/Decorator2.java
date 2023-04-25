package java_basic.stu_design_mode.stu_Decorator.cello2;

public class Decorator2 extends Decorator {
    Decorator2(Common common) {
        super(common);
    }

    @Override
    void operation() {
        super.operation();
        add();
    }
    public void add(){
        System.out.println("Decorator2 修饰");
    }
}
