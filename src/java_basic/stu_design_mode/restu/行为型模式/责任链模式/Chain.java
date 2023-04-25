package java_basic.stu_design_mode.restu.行为型模式.责任链模式;
//责任链接口
public abstract class Chain {
    private String mark;

    public String getMark() {
        return mark;
    }

    public Chain(String mark) {
        this.mark = mark;
    }

    private Chain next;

    public Chain getNext() {
        return next;
    }
    public Chain setNext(Chain next) {
        this.next = next;
        return next;
    }

    public abstract void operation(String msg);



}
