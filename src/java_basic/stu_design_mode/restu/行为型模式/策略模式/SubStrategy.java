package java_basic.stu_design_mode.restu.行为型模式.策略模式;

public class SubStrategy implements Strategy{
    @Override
    public int operation(int num1, int num2) {
        return num1-num2;
    }
}
