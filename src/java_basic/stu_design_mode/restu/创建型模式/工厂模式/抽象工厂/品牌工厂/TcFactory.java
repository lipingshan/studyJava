package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.品牌工厂;

import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.RefrigeratorMachine;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TcRefrigerator;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TcTelevision;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TelevisionMachine;

public class TcFactory implements BrandFactory {
    @Override
    public TelevisionMachine getTelevision() {
        return new TcTelevision();
    }

    @Override
    public RefrigeratorMachine getRefrigerator() {
        return new TcRefrigerator();
    }
}
