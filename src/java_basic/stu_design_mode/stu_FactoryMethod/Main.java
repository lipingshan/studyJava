package java_basic.stu_design_mode.stu_FactoryMethod;

import org.junit.Test;
public class Main {
    @Test
    public void method() {
        //需要通过苹果工程，获取苹果对象进而获取拼过信息
        FruitFactory fruitFactory = new AppleFactory();
        Fruit fruit = fruitFactory.getFruit();
        fruit.getFruitMessage();
    }
}
