需要下载cglib的jar包
参考文档：https://blog.csdn.net/qq_32532321/article/details/81874990
2.基于CGLIB的动态代理

本文主要讲的是CGLIB的动态代理，因为基于JDK的动态代理一定要继承一个接口，
而绝大部分情况是基于POJO类的动态代理，那么CGLIB就是一个很好的选择，
在Hibernate框架中PO的字节码生产工作就是靠CGLIB来完成的。还是先看代码。
可以看到，CGLIB是通过动态生成目标类的子类，在子类中设置拦截逻辑，来进行动态代理。因此目标类的方法不能被final修饰。
1.引入CGLIB的jar包

2.创建被代理类

public class CGsubject {
    public void sayHello(){
        System.out.println("hello world");
    }
}
如果直接对这个类创建对象，那么调用sayHello方法，控制台就会输出hello world，现在我们还是要对输出添加前置和后置的log输出。来打印输出前和输出后的时间。

3.实现MethodInterceptor接口，对方法进行拦截处理。

public class HelloInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("begin time -----> "+ System.currentTimeMillis());
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("end time -----> "+ System.currentTimeMillis());
        return o1;
    }
}


4.创建代理类

public class Main {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CGsubject.class);
        enhancer.setCallback(new HelloInterceptor());
        CGsubject cGsubject = (CGsubject) enhancer.create();
        cGsubject.sayHello();
    }

}
利用Enhancer来生产被代理类，这样可以拦截方法，对方法进行前置和后置log的添加。

输出：

begin time -----> 1534836443741
hello world
end time -----> 1534836443786

这样普通的java类也能被代理。后续会分析CGLIB的原理。
