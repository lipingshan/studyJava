package java_basic.stu_design_mode.restu.行为型模式.观察者模式.example1;
// 观察者1
public class BinaryObserver extends Obsever{

    public BinaryObserver(String key, Subject subject) {
        super(key, subject);
    }

    @Override
    void update() {
        System.out.println("BinaryObserver receives the state news");
        System.out.println(subject.getState()+" of binary is "+Integer.toBinaryString(subject.getState()));
    }
}
