package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂;

public class TcRefrigerator implements RefrigeratorMachine {
    @Override
    public void freeze() {
        System.out.println("TC 冰箱可以冷冻食物。");
    }

    @Override
    public void show() {
        System.out.println("this is TcRefrigerator.");
    }
}
