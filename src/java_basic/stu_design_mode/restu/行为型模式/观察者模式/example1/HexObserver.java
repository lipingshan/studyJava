package java_basic.stu_design_mode.restu.行为型模式.观察者模式.example1;
// 观察者2
public class HexObserver extends Obsever{
    public HexObserver(String key, Subject subject) {
        super(key, subject);
    }

    @Override
    void update() {
        System.out.println("HexObserver receives the state news");
        System.out.println(subject.getState()+" of hex is "+Integer.toHexString(subject.getState()));
    }
}
