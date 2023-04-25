package java_basic.stu_design_mode.stu_Strategy.zero;

import org.junit.Test;

public class Main {
    @Test
    public void method() {
        Context context = new Context();

        //使用策略A
        Strategy concreteStrategyA = new ConcreteStrategyA();
        context.setStrategy(concreteStrategyA);
        context.strategyMethod();//具体策略A的策略方法被访问！

        //使用策略B
        Strategy concreteStrategyB = new ConcreteStrategyB();
        context.setStrategy(concreteStrategyB);
        context.strategyMethod();//具体策略B的策略方法被访问！

    }
}
