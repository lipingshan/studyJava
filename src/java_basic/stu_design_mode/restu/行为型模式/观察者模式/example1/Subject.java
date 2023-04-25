package java_basic.stu_design_mode.restu.行为型模式.观察者模式.example1;

import java.util.ArrayList;
import java.util.List;

//被观察的对象
public class Subject {
    private List<Obsever> obseverList = new ArrayList<Obsever>();
    private int state;
    public void register(Obsever obsever){
        obseverList.add(obsever);

    }
    public void delObserver(Obsever obsever){
        obseverList.remove(obsever);
    }

    public int getState() {
        return state;
    }

    // 消息变动时 进行广播
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public  void notifyAllObservers(){
        for(Obsever ob:obseverList){
            ob.update();
        }
    }
}
