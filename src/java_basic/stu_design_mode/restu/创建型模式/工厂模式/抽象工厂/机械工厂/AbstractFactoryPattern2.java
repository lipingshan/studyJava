package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.机械工厂;

import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.HaierRefrigerator;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TcRefrigerator;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TelevisionMachine;

public class AbstractFactoryPattern2 {
    public static void main(String[] args) {
        System.out.println("######冰箱工厂######");
        //冰箱工厂
        RefrigeratorMachineFactory refrigeratorMachineFactory = new RefrigeratorMachineFactory();
        //海尔冰箱 ，注意此处需要向下强制类型转换
        HaierRefrigerator haierRefrigerator = (HaierRefrigerator)refrigeratorMachineFactory.getHaierMachine();
        haierRefrigerator.show();
        haierRefrigerator.freeze();
        //Tc冰箱
        TcRefrigerator tcRefrigerator = (TcRefrigerator)refrigeratorMachineFactory.getTcMachine();
        tcRefrigerator.show();
        tcRefrigerator.freeze();
        System.out.println("\n######电视工厂######");
        //电视工厂
        TelevisionMachineFactory televisionMachineFactory  = new TelevisionMachineFactory();
        // 海尔电视
        TelevisionMachine haierTelevision = (TelevisionMachine)televisionMachineFactory.getHaierMachine();
        haierTelevision.movie();
        haierTelevision.show();
        // tc电视
        TelevisionMachine tcTelevision = (TelevisionMachine)televisionMachineFactory.getTcMachine();
        tcTelevision.movie();
        tcTelevision.show();
    }
}
