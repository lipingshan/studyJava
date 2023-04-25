package java_basic.stu_design_mode.restu.行为型模式.访问者模式.demo;

public class VisitorDemo {

    public void visit(SubjectDemo subjectDemo){
        //访问者对 访问对象的具体操作
        subjectDemo.show();
    }
}
