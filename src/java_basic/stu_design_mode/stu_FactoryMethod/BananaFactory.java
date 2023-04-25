package java_basic.stu_design_mode.stu_FactoryMethod;

public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
