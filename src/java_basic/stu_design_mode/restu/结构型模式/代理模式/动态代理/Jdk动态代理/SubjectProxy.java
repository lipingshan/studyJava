package java_basic.stu_design_mode.restu.结构型模式.代理模式.动态代理.Jdk动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler {
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行方法之前");
        Object res = method.invoke(subject,args);
        System.out.println("执行方法之后");
        return res;
    }
}
