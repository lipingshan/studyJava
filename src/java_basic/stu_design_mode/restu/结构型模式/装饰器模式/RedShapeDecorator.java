package java_basic.stu_design_mode.restu.结构型模式.装饰器模式;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }
    @Override
    public void draw() {
        super.draw();
        redDraw();
    }
    private void redDraw(){
        System.out.println("涂上红色。");
    }
}
