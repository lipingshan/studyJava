package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.品牌工厂;

import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.HaierRefrigerator;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.HaierTelevision;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.RefrigeratorMachine;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TelevisionMachine;

// 品牌工厂
public class HaierFactory implements BrandFactory {
    @Override
    public TelevisionMachine getTelevision() {
        return new HaierTelevision();
    }

    @Override
    public RefrigeratorMachine getRefrigerator() {
        return new HaierRefrigerator();
    }
}
