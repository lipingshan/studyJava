package java_basic.stu_design_mode.restu.结构型模式.代理模式.静态代理;

public class StudentProxy implements Student{
    private Student student;

    public StudentProxy(Student student) {
        this.student = student;
    }

    @Override
    public void handleWork() {
        System.out.println("处理作业之前。。。");
        student.handleWork();
        System.out.println("处理作业之后。。。");
    }
}
