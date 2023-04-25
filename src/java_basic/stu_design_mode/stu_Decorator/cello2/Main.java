package java_basic.stu_design_mode.stu_Decorator.cello2;

public class Main {
    public static void main(String[] args) {
        Common common =new Common();
        Decorator1 decorator1 =  new Decorator1(common);

        Decorator2 decorator2 = new Decorator2(decorator1);
        decorator2.operation();
    }
}
