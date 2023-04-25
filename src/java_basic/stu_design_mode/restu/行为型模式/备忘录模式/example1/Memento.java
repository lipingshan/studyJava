package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example1;
//2.备忘录角色
//负责存储Originator发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
