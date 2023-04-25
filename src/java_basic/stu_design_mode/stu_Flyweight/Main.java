package java_basic.stu_design_mode.stu_Flyweight;

import org.junit.Test;

public class Main {
    @Test
    public void method() {
        //获取简单的flyweight对象
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        ConcreteFlyweight flyweight = flyweightFactory.getFlyweight("white");//标记该对象为白色

        //引入外部数据到flyweight
        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        unsharedConcreteFlyweight.setAttribute("the attribute from unshareedConcreteFlyweight");
        unsharedConcreteFlyweight.setInfo("the info from unshareedConcreteFlyweight");
        flyweight.operation(unsharedConcreteFlyweight);
        System.out.println(flyweight.getAttribute());

        //再次获取的时候该对象已存在
        ConcreteFlyweight flyweight1 = flyweightFactory.getFlyweight("white");//标记该对象为白色



    }
}
