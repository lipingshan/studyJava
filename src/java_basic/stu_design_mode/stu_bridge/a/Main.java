package java_basic.stu_design_mode.stu_bridge.a;

public class Main {
    public static void main(String[] args) {
        //笔的型号
        Pen bigPen = new BigPen();
        Pen middlePen = new MiddlePen();
        Pen smallPen = new SmallPen();
        //颜色
        Color yellowColor = new YellowColor();
        Color purpleColor = new PurpleColor();
        Color greenColor = new GreenColor();
        Color blueColor = new BlueColor();

        //用笔来蘸颜料
        bigPen.setColor(yellowColor);
        //用笔来画东西
        bigPen.draw("狗子");

        middlePen.setColor(purpleColor);
        middlePen.draw("葡萄");

        smallPen.setColor(greenColor);
        smallPen.draw("翡翠");

        smallPen.setColor(blueColor);
        smallPen.draw("天空");

    }



}
