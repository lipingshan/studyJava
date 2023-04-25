package java_basic.stu_design_mode.stu_Bulider;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    @Test
    public void method() {
        //建造者
       Builder<Object,People> builder = new ConcreteBuilder1();
       //管理者 组织
       People people = Director.Option(builder);
       System.out.println(people.getName());

    }
}
