package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂;

public class TcTelevision implements TelevisionMachine{
    @Override
    public void movie() {
        System.out.println("Tc 电视可以看电影。");
    }

    @Override
    public void show() {
        System.out.println("this is TcTelevision.");
    }
}
