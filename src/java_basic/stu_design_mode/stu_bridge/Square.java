package java_basic.stu_design_mode.stu_bridge;

public class Square extends Shape {
    private Color color;
    @Override
    public double calculatePerimeter(int a) {
        return a*4;
    }
    @Override
    public void handleColor(Color color) {
        System.out.println("这是方形颜色");
        color.showColor();
    }
}
