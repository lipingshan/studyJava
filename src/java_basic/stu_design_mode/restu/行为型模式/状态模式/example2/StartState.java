package java_basic.stu_design_mode.restu.行为型模式.状态模式.example2;

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        context.setState(this);
    }

    @Override
    public void show() {
        System.out.println("this is start state.");
    }
}
