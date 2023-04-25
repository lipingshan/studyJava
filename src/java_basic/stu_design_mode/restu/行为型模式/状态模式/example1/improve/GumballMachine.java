package java_basic.stu_design_mode.restu.行为型模式.状态模式.example1.improve;
// 糖果机
public class GumballMachine extends State{

    // 所有的状态 都属于当前的糖果机 this
    public State noQuarterState = new NoQuarterState(this);
    public State hasQuarterState = new HasQuarterState(this);
    public State soldState = new SoldState(this);
    public State soldOutState = new SoldOutState(this);

    //糖果机的状态 这个状态会随着操作而改变
    private State state = soldOutState;//默认状态 糖果发完了
    //糖果的数量
    private int candyCount = 0;

    public GumballMachine(int count) {//初始化
        this.candyCount = count;
        if(count > 0)
            setState(noQuarterState);// 当糖果的数量大于0，则将糖果机的状态改为 没有硬币的状态
    }

    // 当前状态下操作糖果机
    @Override // 投币
    public void insertQuarter() {
        state.insertQuarter();
    }
    @Override
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    @Override
    public void turnCrank() {
        state.turnCrank();
    }
    @Override
    public void dispense() {
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setCandyCount(int candyCount) {
        this.candyCount = candyCount;
    }

    public int getCandyCount() {
        return candyCount;
    }



}