package java_basic.stu_design_mode.stu_proxy.dynamic_proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HandleInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
       System.out.println("------执行前------");
       Object res =  methodProxy.invokeSuper(o,objects);
       if(res!=null){
           System.out.println(res);
       }
        System.out.println("------执行后------");
        return res;
    }
}
