package java_basic.stu_design_mode.restu.结构型模式.桥接模式;

public abstract class Phone  {
    private Brand brand;
    Phone(Brand brand){
        this.brand = brand;
    }
    void call(String style){
        brand.call(style);
    }
}
