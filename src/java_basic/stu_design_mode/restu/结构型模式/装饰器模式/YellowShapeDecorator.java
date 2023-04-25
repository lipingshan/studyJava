package java_basic.stu_design_mode.restu.结构型模式.装饰器模式;

public class YellowShapeDecorator extends ShapeDecorator{
    public YellowShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        yellowDraw();
    }
    private void yellowDraw(){
        System.out.println("涂上黄色。");
    }
}
