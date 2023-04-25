package java_basic.stu_design_mode.stu_Decorator.cello2;

public class Decorator1 extends Decorator {
    Decorator1(Common common) {
        super(common);
    }

    @Override
    void operation() {
        super.operation();
        add();
    }
    public void add(){
        System.out.println("Decorator1 修饰");
    }
}
