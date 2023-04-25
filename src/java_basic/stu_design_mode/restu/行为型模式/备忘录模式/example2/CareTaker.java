package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example2;

import java.util.ArrayList;
import java.util.List;
// 备忘录管理者
public class CareTaker {
    private List<Memento> mementoList ;

    public CareTaker() {
        this.mementoList = new ArrayList<>();
    }
    public void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
        if(mementoList.size()==0){
            System.out.println("没有备份数据");
        }else{
            if(index<0||index>mementoList.size()){
                System.out.println("参数错误");
            }
        }

        return mementoList.get(index);

    }

}
