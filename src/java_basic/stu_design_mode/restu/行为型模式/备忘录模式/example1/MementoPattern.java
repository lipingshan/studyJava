package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example1;

public class MementoPattern {
    public static void main(String[] args) {
        // 发起人角色
        Originator originator = new Originator();
        originator.setState("状态1");
        originator.show();

        //备忘录管理者
        // Originator 所关注的状态数据state 保存在备忘录CreateMemento中，备忘录管理者Caretaker来管理 备忘录CreateMemento
        // originator.createMemento() 表示创建备忘录，然后放入备忘录管理者中
        Caretaker caretaker = new Caretaker(originator.createMemento());

       // 再一次更改状态
        originator.setState("状态2");
        originator.show();

        //originator根据备忘录回复状态 备份的状态信息从备忘录管理者Originator中拿
        originator.rollback(caretaker.getMemento());
        originator.show();
    }
}
