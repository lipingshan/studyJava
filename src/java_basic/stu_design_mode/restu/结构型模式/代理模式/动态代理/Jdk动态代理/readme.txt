1.基于JDK的动态代理
//参考文档
//https://blog.csdn.net/qq_32532321/article/details/81874990
基于JDK的动态代理就需要知道两个类：1.InvocationHandler（接口）、2.Proxy（类）

还要知道JDK是基于接口的动态代理

下面我们实际用代码来讲解这两个类的实际作用

1.第一步，创建一个接口

public interface Subject {
    void hello(String param);
}
2.第二步，实现接口

public class SubjectImpl implements Subject {
    @Override
    public void hello(String param) {
        System.out.println("hello  " + param);
    }
}
3.第三步，创建SubjectImpl的代理类

public class SubjectProxy implements InvocationHandler {
    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("--------------begin-------------");
        Object invoke = method.invoke(subject, args);
        System.out.println("--------------end-------------");
        return invoke;
    }
}
invoke方法的说明：



4.编写代理类实际的调用，利用Proxy类创建代理之后的Subject类。

public class Main {

    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        InvocationHandler subjectProxy = new SubjectProxy(subject);
        Subject proxyInstance = (Subject) Proxy.newProxyInstance(subjectProxy.getClass().getClassLoader(), subject.getClass().getInterfaces(), subjectProxy);
        proxyInstance.hello("world");
    }

}


输出：

--------------begin-------------
hello  world
--------------end-------------

看这个结果，实际上在Subject类中只会输出一条hello world，但是在被代理之后，实际调用的方法是SubjectProxy的invoke方法，这样可以在不修改业务类的情况下对业务类增加一些日志等其他操作，甚至可以直接修改有返回值方法的返回值。
————————————————
版权声明：本文为CSDN博主「独在黑夜看湖面」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
原文链接：https://blog.csdn.net/qq_32532321/article/details/81874990