package java_basic.stu_design_mode.stu_bridge.a;

public class YellowColor implements Color {
    String clr = "黄色";
    @Override
    public void bepaint(String penType, String name) {
        System.out.println("用"+penType+"画了一个"+clr+"的"+name);
    }
}
