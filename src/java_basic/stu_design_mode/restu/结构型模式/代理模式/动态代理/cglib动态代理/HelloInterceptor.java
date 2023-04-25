package java_basic.stu_design_mode.restu.结构型模式.代理模式.动态代理.cglib动态代理;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
//
public class HelloInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("方法执行前");
        Object res = methodProxy.invokeSuper(o,objects);
        System.out.println("方法执行之后");
        return res;
    }
}
