package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example1;
//1. 发起人角色
//记录当前时刻的内部状态，并负责创建和恢复备忘录数据，允许访问返回到先前状态所需的所有数据
public class Originator {
    // 需要备份的状态信息
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录
    public Memento createMemento(){
        return new Memento(state);
    }
    //恢复备忘录
    public void rollback(Memento memento){
        this.state = memento.getState();
    }

    public void show(){
        System.out.println("the current state msg is :"+state);
    }


}
