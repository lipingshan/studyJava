package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.品牌工厂;


import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.RefrigeratorMachine;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TelevisionMachine;

public class AbstractFactroyPattern1 {
    public static void main(String[] args) {
        System.out.println("######海尔工厂######");
        // 海尔工厂
        BrandFactory haierFactory = new HaierFactory();
        // 海尔冰箱
        RefrigeratorMachine haierRefrigerator = haierFactory.getRefrigerator();
        // 海尔电视机
        TelevisionMachine haierTelevision = haierFactory.getTelevision();
        haierRefrigerator.show();
        haierTelevision.show();
        System.out.println("\n######Tc工厂######");
        // Tc工厂
        BrandFactory tcFactory = new TcFactory();
        // Tc冰箱
        RefrigeratorMachine tcRefrigerator = tcFactory.getRefrigerator();
        // Tc电视机
        TelevisionMachine tcTelevision = tcFactory.getTelevision();

        tcRefrigerator.show();
        tcTelevision.show();
    }
}
