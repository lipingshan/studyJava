package java_basic.stu_design_mode.restu.结构型模式.装饰器模式;

public class Main {
    public static void main(String[] args) {

        //形状
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        //装饰颜色
        //圆形红色
        ShapeDecorator redCircle = new RedShapeDecorator(circle);
        //圆形黄色
        ShapeDecorator yellowCircle = new YellowShapeDecorator(circle);

        //方形红色
        ShapeDecorator redRectangle = new RedShapeDecorator(rectangle);
        //方形黄色
        ShapeDecorator yellowRectangle = new YellowShapeDecorator(rectangle);

        //大尺寸 方形黄色
        SizeDecorator bigDecorator = new BigDecorator(yellowRectangle);
        //小尺寸 方形红色
        SizeDecorator smallDecorator = new SmallDecorator(redRectangle);

        redCircle.draw();
        yellowCircle.draw();
        redRectangle.draw();
        yellowRectangle.draw();

        bigDecorator.draw();
        smallDecorator.draw();

    }
}
