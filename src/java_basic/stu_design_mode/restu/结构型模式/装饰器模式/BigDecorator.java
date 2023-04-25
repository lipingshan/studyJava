package java_basic.stu_design_mode.restu.结构型模式.装饰器模式;

public class BigDecorator extends SizeDecorator{
    public BigDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        bigDraw();
    }
    private void bigDraw(){
        System.out.println("型号为大。");
    }
}
