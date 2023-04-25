package java_basic.stu_design_mode.restu.行为型模式.模板模式;

public abstract class Game {
    abstract  void  initialize();
    abstract void startPlay();
    abstract void endPlay();
    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
}
