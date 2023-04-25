package java_basic.stu_design_mode.restu.结构型模式.代理模式.静态代理;

public class StaticProxyPattern {
    public static void main(String[] args) {
        Student student = new StudentImple("小明");
        Student studentProxy = new StudentProxy(student);
        studentProxy.handleWork();
    }
}
