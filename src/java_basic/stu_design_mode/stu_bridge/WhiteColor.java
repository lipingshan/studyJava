package java_basic.stu_design_mode.stu_bridge;

public class WhiteColor implements Color {
    @Override
    public void showColor() {
        System.out.println("这是白色");
    }
    public void canDor(){
        System.out.println("白色的颜色可以使人感到纯净，光鲜");
    }
}
