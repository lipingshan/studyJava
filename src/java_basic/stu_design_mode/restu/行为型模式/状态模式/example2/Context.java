package java_basic.stu_design_mode.restu.行为型模式.状态模式.example2;

public class Context {
    private State state;
    public void setState(State state){
        this.state=state;
    }
    public State getState(){
        return  state;
    }
}
