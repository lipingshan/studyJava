package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂;

public class HaierTelevision implements TelevisionMachine {
    @Override
    public void movie() {
        System.out.println("海尔电视机可以看电影。");
    }

    @Override
    public void show() {
        System.out.println("this is haierTelevision.");
    }
}
