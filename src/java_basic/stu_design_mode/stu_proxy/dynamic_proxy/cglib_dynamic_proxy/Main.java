package java_basic.stu_design_mode.stu_proxy.dynamic_proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class Main {
    @Test
    public void method() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Subject.class);
        enhancer.setCallback(new HandleInterceptor());
        Subject subject = (Subject) enhancer.create(new Class[]{String.class},new Object[]{"小明"});
        subject.getName();
       // enhancer.create(String.class,new Object[]{});
    }
}
