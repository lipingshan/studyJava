package java_basic.stu_design_mode.restu.结构型模式.代理模式.动态代理.Jdk动态代理;

import java.lang.reflect.Proxy;

public class JDKDynamicProxyPattern {
    public static void main(String[] args) {
        Subject subject = new SubjectImpl("小明");
        SubjectProxy subjectProxy = new SubjectProxy(subject);
        Subject proxy = (Subject)Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(),subjectProxy);
        proxy.add(1,6);
        proxy.message();
    }
}
