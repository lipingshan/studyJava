package java_basic.stu_design_mode.restu.行为型模式.观察者模式.demo;

import java.util.ArrayList;
import java.util.List;

public class MoveObject {
    public static void main(String[] args) {
        List<People>  peoples = new ArrayList<>();
        peoples.add(new People("小敏",2));
        peoples.add(new People("小明",2));
        for(People p1 :peoples){
            System.out.println(p1.getName()+" : "+p1.getAge());
        }
        System.out.println("#####移除#####");
        peoples.remove(new People("小明",1));
        for(People p1 :peoples){
            System.out.println(p1.getName()+" : "+p1.getAge());
        }
    }
}
