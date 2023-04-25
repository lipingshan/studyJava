package java_basic.stu_design_mode.restu.行为型模式.策略模式;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int calculate(int num1,int num2){
        return strategy.operation(num1,num2);
    }
}
