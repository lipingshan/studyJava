package java_basic.stu_design_mode.stu_bridge.a;

public class SmallPen extends Pen {
    private String penType="小号笔";
    @Override
    public void draw(String name) {
        this.color.bepaint(penType,name);
    }
}
