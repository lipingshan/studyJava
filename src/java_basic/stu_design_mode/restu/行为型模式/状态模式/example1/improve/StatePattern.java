package java_basic.stu_design_mode.restu.行为型模式.状态模式.example1.improve;

public class StatePattern {
    public static void main(String[] args) {
        //初始化糖果机 1.给一个初始状态(没有硬币) 2.给糖果数
        GumballMachine gumballMachine = new GumballMachine(3);
        // 操作糖果机
        for(int i=1;i<4;i++){
            System.out.println("#######一次开始#########");
            //投币
            gumballMachine.insertQuarter();
            // 转轴
            gumballMachine.turnCrank();
            //发糖
            gumballMachine.dispense();
            System.out.println("#######一次结束#########\n");
        }

    }
}
