package java_basic.stu_design_mode.stu_bridge.a;

public abstract class Pen {
    protected Color color;
    public void setColor(Color color){
      this.color = color;
    }
    public abstract  void draw(String name);
}
