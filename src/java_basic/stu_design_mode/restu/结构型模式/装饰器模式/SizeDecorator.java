package java_basic.stu_design_mode.restu.结构型模式.装饰器模式;

public abstract class SizeDecorator implements Shape {
    private Shape decoratorShape;
    public SizeDecorator(Shape decoratorShape){
        this.decoratorShape = decoratorShape;
    }
    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
