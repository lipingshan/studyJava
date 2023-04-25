package java_basic.stu_design_mode.restu.行为型模式.模板模式;

public class ChessGame extends Game{
    @Override
    void initialize() {
        System.out.println("下棋初始化。");
    }

    @Override
    void startPlay() {
        System.out.println("开始下棋。");
    }

    @Override
    void endPlay() {
        System.out.println("下棋结束。");
    }

}
