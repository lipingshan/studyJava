package java_basic.stu_design_mode.restu.创建型模式.建造者模式;
//具体建造者
public class ConcreteBuilder extends Builder{
    @Override
    void buildPartA(String partA) {
        //其他可能复杂操作
        product.setPartA(partA);
    }

    @Override
    void buildPartB(String partB) {
        //其他可能复杂操作
        product.setPartB(partB);
    }

    @Override
    void buildPartC(String partC) {
        //其他可能复杂操作
        product.setPartC(partC);
    }
}
