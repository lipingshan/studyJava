package java_basic.stu_design_mode.stu_proxy.dynamic_proxy.jdk_dynamic_proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class JDKDynimic {
    @Test
    public void method() {
        SubjectImpl subject = new SubjectImpl("小明");
        SubjectProxy subjectProxy = new SubjectProxy(subject);
        Subject proxy = ( Subject)Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),subjectProxy );
        System.out.println(proxy.getScore(3,5));
        System.out.println(proxy.showMessage("hello world"));



    }
}
