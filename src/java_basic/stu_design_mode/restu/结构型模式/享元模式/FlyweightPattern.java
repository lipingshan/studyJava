package java_basic.stu_design_mode.restu.结构型模式.享元模式;

public class FlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        FlyWeight flyweight = flyweightFactory.getFlyweight("a");
        flyweight.operation(new UnsharedConcreteFlyweight("外部的参数123"));
        System.out.println("#############################");
        flyweight = flyweightFactory.getFlyweight("a");
        flyweight.operation(new UnsharedConcreteFlyweight("外部的参数456"));

    }
}
