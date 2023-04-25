package java_basic.stu_design_mode.restu.行为型模式.访问者模式.demo;

public class MainTest {
    public static void main(String[] args) {

        // 访问者的模式为
        // 访问者
        VisitorDemo visitorDemo = new VisitorDemo();
        // 被访问者
        SubjectDemo subjectDemo = new SubjectDemo();
        // 被访问者接受访问者
        subjectDemo.accept(visitorDemo);


        System.out.println("#######################");
        // 当然也可以这样执行
        // 表示访问者去访问某个对象
        visitorDemo.visit(subjectDemo);




    }
}
