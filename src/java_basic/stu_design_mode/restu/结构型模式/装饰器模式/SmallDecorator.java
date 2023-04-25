package java_basic.stu_design_mode.restu.结构型模式.装饰器模式;

public class SmallDecorator extends SizeDecorator{
    @Override
    public void draw() {
        super.draw();
        smallDraw();
    }

    public SmallDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }
    private void smallDraw(){
        System.out.println("型号为小。");
    }
}
