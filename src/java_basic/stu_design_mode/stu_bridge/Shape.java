package java_basic.stu_design_mode.stu_bridge;

public abstract class Shape {
 abstract double calculatePerimeter(int a);

 private Color color;
 public abstract void handleColor(Color color);
}
