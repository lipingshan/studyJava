package java_basic.stu_design_mode.restu.创建型模式.工厂模式.简单工厂;

public class SimpleFactoryPattern {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit app=fruitFactory.getFruit("apple");
        app.show();
        fruitFactory.getFruit("banana").show();
    }
}
