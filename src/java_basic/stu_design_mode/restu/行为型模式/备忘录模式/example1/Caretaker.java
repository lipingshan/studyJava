package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example1;
//3.备忘录管理员角色
//对备忘录进行管理、保存和提供备忘录，只能将备忘录传递给其他角色。
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public Caretaker(Memento memento) {
        this.memento = memento;
    }
}
