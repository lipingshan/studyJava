package java_basic.stu_design_mode.stu_bridge.a;

public class MiddlePen extends Pen {
    private String penType="中号笔";
    @Override
    public void draw(String name) {
        this.color.bepaint(penType,name);
    }
}
