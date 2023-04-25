package java_basic.stu_design_mode.restu.行为型模式.策略模式;

public class StrategyPattern {
    public static void main(String[] args) {
        System.out.println("########加法#######");
        //加法
        Strategy addStrategy = new AddStrategy();
        //环境
        Context context = new Context(addStrategy);  // 可以设置成set形式，共用环境的话有点状态模式的意思
        System.out.println("加法："+context.calculate(1,5));

        System.out.println("########减法#######");
        // 减法
        Strategy subStrategy = new SubStrategy();
        //环境1
        Context context1 = new Context(subStrategy);
        System.out.println("减法："+context1.calculate(3,7));

    }
}
