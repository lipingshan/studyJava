package java_basic.stu_design_mode.restu.结构型模式.装饰器模式;

public abstract class ShapeDecorator implements Shape {
    protected Shape decoratorShape;
    public ShapeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }
    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
