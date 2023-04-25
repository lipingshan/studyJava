package java_basic.stu_design_mode.stu_Adapter.objectStructure;


import org.junit.Test;

public class Main {
    @Test
    public void method() {
        Subject subject = new Subject();
        Target target = new AdapterSubject(subject);
        doMethod(target);

    }
    public void  doMethod(Target target){
        System.out.println(target.getNumber(3,5));
        target.option();
    }
}
