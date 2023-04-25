package java_basic.stu_design_mode.restu.行为型模式.模板模式;

public class FootBallGame extends Game {
    @Override
    void initialize() {
        System.out.println("足球初始化。");
    }

    @Override
    void startPlay() {
        System.out.println("足球开始。");
    }

    @Override
    void endPlay() {
        System.out.println("足球结束。");
    }
}
