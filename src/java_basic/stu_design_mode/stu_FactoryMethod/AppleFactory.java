package java_basic.stu_design_mode.stu_FactoryMethod;

public class AppleFactory implements FruitFactory{

    @Override
    public Fruit getFruit() {
        return new Apple();
    }
}
