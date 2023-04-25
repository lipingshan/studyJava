package java_basic.stu_design_mode.restu.创建型模式.建造者模式;
//抽象建造者
public abstract class Builder {
    Product product  = new Product();//注意这个对象 会被公用
    abstract void buildPartA(String partA);
    abstract void buildPartB(String partB);
    abstract void buildPartC(String partC);
    public  Product getProduct(){
        return product;
    }
}
