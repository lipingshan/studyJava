package java_basic.stu_design_mode.restu.行为型模式.状态模式.example1.improve;
// 每一个状态对应四个操作
public abstract class State {
    /**
     * 投币
     */
    public abstract void insertQuarter();

    /**
     * 退币
     */
    public abstract void ejectQuarter();

    /**
     * 转动出糖曲轴
     */
    public abstract void turnCrank();

    /**
     * 发糖
     */
    public abstract void dispense();

    /**
     * 退还硬币
     */
    protected void returnQuarter() {
        System.out.println("退币……");
    }
}
