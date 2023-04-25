package java_basic.stu_design_mode.stu_proxy.dynamic_proxy.jdk_dynamic_proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//代理类
public class SubjectProxy implements InvocationHandler {
    private Subject subject;
    public SubjectProxy(Subject subject){
        this.subject = subject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---执行前---");
        Object res = method.invoke(subject,args);
        System.out.println("---执行后---");
        return res;
    }
}
