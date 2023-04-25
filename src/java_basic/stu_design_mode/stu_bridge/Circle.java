package java_basic.stu_design_mode.stu_bridge;

public class Circle extends Shape {
    String mark="圆形";
    @Override
    public double calculatePerimeter(int a) {
        return Math.PI*2*a;
    }

    @Override
    public void handleColor(Color color) {
        System.out.println("这是圆形的颜色");
        color.showColor();
    }

    public void handleRectangle(){
        System.out.println("这是圆形特有的动作--->"+mark);
    }
}
