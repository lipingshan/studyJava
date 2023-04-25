package java_basic.stu_design_mode.restu.行为型模式.访问者模式.demo;

public class SubjectDemo {
    // 表示接受访问者，并且将‘自己’作为参数返回。
    // 具体调用哪些方法，操作哪些成员变量，由访问者决定。
    void accept(VisitorDemo visitorDemo){
        //  访问者模式的理念是将数据结构与
        visitorDemo.visit(this);//方法调用
    }
    public  void show(){
        System.out.println("my name is subject,欢迎你的访问");
    }
}
