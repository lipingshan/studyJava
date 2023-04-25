package java_basic.stu_design_mode.restu.结构型模式.代理模式.动态代理.cglib动态代理;
//被代理对象
public class CGSubject {
    public void say(){
        System.out.println("I can speak English");
    }
    public void show(){
        System.out.println("there is something");
    }
}
