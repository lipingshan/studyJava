package java_basic.stu_design_mode.stu_Adapter.classStructure;

import org.junit.Test;

public class Main {
    @Test
    public void method() {
        Target target = new AdapterSubject();
        doMethod(target);
    }
    public void  doMethod(Target target){
        System.out.println(target.getNumber(3,5));
        target.option();
    }

}
