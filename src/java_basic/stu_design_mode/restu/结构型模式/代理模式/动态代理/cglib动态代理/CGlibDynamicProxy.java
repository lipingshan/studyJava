package java_basic.stu_design_mode.restu.结构型模式.代理模式.动态代理.cglib动态代理;

import net.sf.cglib.proxy.Enhancer;
//代理类
public class CGlibDynamicProxy {
    public static void main(String[] args) {
        Enhancer enhance = new Enhancer();
        enhance.setSuperclass(CGSubject.class);
        enhance.setCallback(new HelloInterceptor());
        CGSubject cgSubject = (CGSubject)enhance.create();
        cgSubject.say();
        cgSubject.show();
    }

}
