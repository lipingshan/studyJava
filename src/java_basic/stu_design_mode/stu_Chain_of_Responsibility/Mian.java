package java_basic.stu_design_mode.stu_Chain_of_Responsibility;

public class Mian {
    public static void main(String[] args) {
        //组装责任链
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNext(handler2);//handler1--->handler2
        handler2.setNext(handler3);//handler2--->handler3
        //handler1-->handler2-->handler3
        //提交请求

        handler1.handleRequest("two");
        handler1.handleRequest("three");
        handler1.handleRequest("one");
        handler1.handleRequest("诸葛掘机");
    }
}
