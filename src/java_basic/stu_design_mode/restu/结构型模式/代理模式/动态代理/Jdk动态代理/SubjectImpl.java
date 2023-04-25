package java_basic.stu_design_mode.restu.结构型模式.代理模式.动态代理.Jdk动态代理;

public class SubjectImpl implements Subject {
    private String name;

    public SubjectImpl(String name) {
        this.name = name;
    }

    @Override
    public void message() {
        System.out.println("name="+name);
    }
    @Override
    public int add(int a, int b) {
        System.out.println("a+b="+(a+b));
        return a+b;
    }
}
