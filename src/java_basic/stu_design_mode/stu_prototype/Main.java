package java_basic.stu_design_mode.stu_prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Main {
    @Test
    public void method() {
        List<String> list = new ArrayList();//调用People的构造方法
        list.add("fruit");
        list.add("candy");
        list.add("fishing");
        try {
            People p1 = new People("小明",999,list);
            People p2 = (People)p1.clone();//此时没有调用构造函数
            System.out.println("p1==p2 is  "+(p1==p2));//p1==p2 is  false
            System.out.println("p1.getName()===>"+p1.getName());//p1.getName()===>小明
            System.out.println("p2.getName()===>"+p2.getName());//p2.getName()===>小明
            p2.setName("小刚");
            System.out.println("p1.getName()===>"+p1.getName());//p1.getName()===>小明
            System.out.println("p2.getName()===>"+p2.getName());//p2.getName()===>小刚
            //true 说明引用类型指向的内存是同一块内存，这就属于浅拷贝
            System.out.println("p1.getHobby()==p2.getHobby() "+(p1.getHobby()==p2.getHobby()));//p1.getHobby()==p2.getHobby() true
            System.out.println("p1.getHobby().get(0)===>"+p1.getHobby().get(0));//p1.getHobby().get(0)===>fruit
            System.out.println("p2.getHobby().get(0)===>"+p2.getHobby().get(0));//p2.getHobby().get(0)===>fruit
            p1.getHobby().set(0,"aaa");
            System.out.println(p2.getHobby().get(0));//aaa
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }


}
