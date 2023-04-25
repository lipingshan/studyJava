package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example2;
// 备忘录
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
