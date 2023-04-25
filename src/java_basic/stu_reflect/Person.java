package java_basic.stu_reflect;
import lombok.Data;

import java.time.LocalTime;
import java.util.Date;
@Data
public class Person {
private String name;
private int age;
private static LocalTime time= LocalTime.now();
    public Person(){
        System.out.println("默认的无参构造方法执行了");
    }

    public Person(String name){
        this.name = name;
        System.out.println("姓名:"+name);
    }

    public Person(String name,int age){
        this.age=age;
        this.name=name;
        System.out.println(name+"="+age);
    }

    private Person(int age){
        this.age = age;
        System.out.println("年龄:"+age);
    }

    public void m1() {
        System.out.println("m1");
    }

    public void m2(String name) {
        System.out.println(name);
    }

    public String m3(String name,int age) {
        System.out.println(name+":"+age);
        return "aaa";
    }

    private void m4(Date d) {
        System.out.println(d);
    }

    public static void m5(String param) {
        System.out.println("m5->"+param);
    }

    public static void m6(String[] strs) {
        System.out.println(strs.length);
    }

    public static void main(String[] args) {
        System.out.println("main");
    }

}




