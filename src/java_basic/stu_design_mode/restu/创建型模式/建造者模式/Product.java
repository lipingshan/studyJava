package java_basic.stu_design_mode.restu.创建型模式.建造者模式;

import lombok.Data;

// 产品角色
@Data
class Product {
    private String partA;
    private String partB;
    private String partC;

    public void show() {
        System.out.println("partA=>"+this.getPartA()+
                           "\npartB=>"+this.getPartB()+
                           "\npartC=>"+this.getPartC());
        //显示产品的特性
    }
}