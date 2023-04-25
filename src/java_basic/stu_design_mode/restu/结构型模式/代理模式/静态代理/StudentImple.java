package java_basic.stu_design_mode.restu.结构型模式.代理模式.静态代理;

public class StudentImple implements  Student{
    private String name;

    public StudentImple(String name) {
        this.name = name;
    }

    @Override
    public void handleWork() {
        System.out.println(name+"正在处理作业。");
    }
}
