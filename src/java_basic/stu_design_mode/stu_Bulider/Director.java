package java_basic.stu_design_mode.stu_Bulider;

import java.util.ArrayList;
import java.util.List;

//指挥者
public class Director {
   public static People Option(Builder<Object,People> builder){
     builder.setName("小明");
     builder.setCity("河南");
     builder.setAge(9999);
     builder.setScore(1000000);
     List<String> list = new ArrayList<String>();
     list.add("fruit");list.add("fishing");list.add("shopping");
     builder.setHobby(list);
     return builder.getPeople();
   }
}
