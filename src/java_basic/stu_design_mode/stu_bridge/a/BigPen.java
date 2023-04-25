package java_basic.stu_design_mode.stu_bridge.a;

public class BigPen extends Pen {
    private String penType="大号笔";
    @Override
    public void draw(String name) {
        this.color.bepaint(penType,name);
    }
}
