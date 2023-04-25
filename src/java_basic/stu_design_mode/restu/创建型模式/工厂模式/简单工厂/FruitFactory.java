package java_basic.stu_design_mode.restu.创建型模式.工厂模式.简单工厂;

public class FruitFactory {
    public Fruit getFruit(String name){

        if(name.equals("apple")){
            Apple apple = new Apple();
            apple.setAge(12);
            apple.setName("苹果");
            return apple;
        }else if(name.equals("banana")){
            Banana banana = new Banana();
            banana.setAge(23);
            banana.setName("香蕉");
            return banana;
        }
        return null;
    }
}
