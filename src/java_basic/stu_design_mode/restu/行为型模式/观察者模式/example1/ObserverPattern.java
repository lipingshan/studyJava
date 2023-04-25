package java_basic.stu_design_mode.restu.行为型模式.观察者模式.example1;

public class ObserverPattern {
    public static void main(String[] args) {
        // 被观察者
        Subject subject = new Subject();

        // 观察者1
        Obsever binaryObserver = new BinaryObserver("二进制观察者",subject);
        // 观察者2
        Obsever hexObserver = new HexObserver("十六进制观察者",subject);

        //被观察者发出信息,观察者处理。
        subject.setState(110);

    }
}
