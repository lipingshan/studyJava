package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example2;
//发起者
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Originator(String state) {
        this.state = state;
    }
    // 创建备忘录
    public Memento createMemento(){
        return new Memento(state);
    }
    // 恢复数据
    public void rollbackFromMemento(Memento memento){
        this.state = memento.getState();
    }
}
