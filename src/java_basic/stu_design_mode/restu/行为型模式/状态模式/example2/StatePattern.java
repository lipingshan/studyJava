package java_basic.stu_design_mode.restu.行为型模式.状态模式.example2;

public class StatePattern {
    public static void main(String[] args) {
        System.out.println("###########start state############");
        //环境
        Context context = new Context();
        //状态 开始状态
        State startState = new StartState();
        //状态转移->开始
        startState.doAction(context);
        //获取状态 从环境中
        State contextState = context.getState();
        //功能体现
        contextState.show();
        System.out.println("###########stop state############");
        //状态 结束状态
        State stopState = new StopState();
        //状态转移->结束
        stopState.doAction(context);
        //获取状态从环境中
        StopState toStopState = (StopState)context.getState();
        //功能体现
        toStopState.other();


    }
}
