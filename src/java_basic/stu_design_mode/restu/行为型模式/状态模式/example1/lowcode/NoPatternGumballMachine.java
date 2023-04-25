package java_basic.stu_design_mode.restu.行为型模式.状态模式.example1.lowcode;

public class NoPatternGumballMachine {
    /*
     * 四个状态
     */
    /**
     * 没有硬币状态
     */
    private final static int NO_QUARTER = 0;
    /**
     * 投币状态
     */
    private final static int HAS_QUARTER = 1;
    /**
     * 出售糖果状态
     */
    private final static int SOLD = 2;
    /**
     * 糖果售尽状态
     */
    private final static int SOLD_OUT = 3;

    private int state = SOLD_OUT;
    private int candyCount = 0;

    public NoPatternGumballMachine(int count) {
        this.candyCount = count;
        if (candyCount > 0)
            state = NO_QUARTER;
    }

    /*
     * 四个动作
     */

    /**
     * 投币
     */
    public void insertQuarter() {
        if (NO_QUARTER == state) { // 没有硬币状态可投币
            System.out.println("投币");
            state = HAS_QUARTER;
        } else if (HAS_QUARTER == state) {// 已有硬币状态不可投币
            System.out.println("请不要重复投币！");
            returnQuarter();
        } else if (SOLD == state) {//出售糖果状态 不可投币
            System.out.println("已投币，请等待糖果");
            returnQuarter();
        } else if (SOLD_OUT == state) {// 糖果售尽 不可投币
            System.out.println("糖果已经售尽");
            returnQuarter();
        }
    }

    /**
     * 退币
     */
    public void rejectQuarter() {
        if (NO_QUARTER == state) { // 没有硬币 无法退币
            System.out.println("没有硬币，无法弹出");
        } else if (HAS_QUARTER == state) { // 已投币 可以退币
            returnQuarter();
            state = NO_QUARTER;
        } else if (SOLD == state) {// 出售糖果时 无法退币
            System.out.println("无法退币，正在发放糖果，请等待");
        } else if (SOLD_OUT == state) {// 糖果售尽（无法投币） 无法退币
            System.out.println("没有投币，无法退币");
        }
    }

    /**
     * 转动出糖曲轴
     */
    public void turnCrank() {
        if (NO_QUARTER == state) { //没有硬币 无法转动曲轴
            System.out.println("请先投币");
        } else if (HAS_QUARTER == state) {// 已投币 可以转动曲轴
            System.out.println("转动曲轴，准备发糖");
            state = SOLD;
        } else if (SOLD == state) {// 出售糖果 无法转动曲轴
            System.out.println("已按过曲轴，请等待");
        } else if (SOLD_OUT == state) {// 糖果售尽 无法转动曲轴
            System.out.println("糖果已经售尽");
        }
    }

    /**
     * 发糖
     */
    public void dispense() {
        if (NO_QUARTER == state) {// 没有投币 无法发糖
            System.out.println("没有投币，无法发放糖果");
        } else if (HAS_QUARTER == state) {//已投币 但时机不到 无法发糖
            System.out.println("this method don't support");
        } else if (SOLD == state) {
            if (candyCount > 0) {// 出售糖果 如果有 可以发糖
                System.out.println("分发一颗糖果");
                candyCount--;
                state = NO_QUARTER;
            } else {
                System.out.println("抱歉，糖果已售尽");// 出售糖果 如果售尽 无法发糖
                state = SOLD_OUT;
            }
        } else if (SOLD_OUT == state) {//售尽 无法发唐
            System.out.println("抱歉，糖果已售尽");
        }
    }

    /**
     * 退还硬币
     */
    protected void returnQuarter() {
        System.out.println("退币……");
    }

//    从代码里面可以看出，糖果机根据此刻不同的状态，而使对应的动作呈现不同的结果。
//    这份代码已经可以满足我们的基本需求，但稍微思考一下，你会觉得这种实现代码似乎，功能太复杂了，扩展性很差，没有面向对象的风格。
//
//    假设由于新需求，要增加一种状态，那每个动作方法我们都需要修改，都要重新增加一条else语句。
//    而如果需求变更，某个状态下的动作需要修改，我们也要同时改动四个方法。这样的工作将是繁琐而头大的。

    public static void main(String[] args) {
        // 初始化糖果机 3个糖果
        NoPatternGumballMachine noPatternGumballMachine = new NoPatternGumballMachine(3);

        for(int i=1;i<=4;i++){
            System.out.println("#######一轮开始#######");
            //投币
            noPatternGumballMachine.insertQuarter();
            //转动曲轴
            noPatternGumballMachine.turnCrank();
            //发糖
            noPatternGumballMachine.dispense();
            System.out.println("#######一轮结束#######\n");
        }


    }

}