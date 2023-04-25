package java_basic.stu_design_mode.restu.行为型模式.观察者模式.example2;
//被观察者接口
public interface Subject {
    // 注册观察者
    void registerObserver(Observer observer);
    // 移除观察者
    void moveObserver(Observer observer);
    // 发送消息
    void notifyObservers();
}
