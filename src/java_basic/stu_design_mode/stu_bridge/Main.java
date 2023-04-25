package java_basic.stu_design_mode.stu_bridge;

import org.junit.Test;

public class Main {
    @Test
    public void method() {
        Color blueColor = new BlueColor();
        Color whiteColor = new WhiteColor();


        Shape square = new Square();
        square.handleColor(blueColor);
        square.handleColor(whiteColor);

        Shape circle = new Circle();
        circle.handleColor(blueColor);
        circle.handleColor(whiteColor);
    }
}
