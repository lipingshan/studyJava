package java_basic.stu_design_mode.stu_Decorator.cello2;

public class Decorator  extends Common{
    private Common common;
    Decorator(Common common){
        this.common = common;
    }
    @Override
    void operation() {
        super.operation();
    }
}
