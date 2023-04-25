package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.机械工厂;

import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.HaierRefrigerator;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.Machine;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TcRefrigerator;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TcTelevision;

public class RefrigeratorMachineFactory implements MachineFactory{
    @Override
    public Machine getHaierMachine() {
        return new HaierRefrigerator();
    }

    @Override
    public Machine getTcMachine() {
        return new TcRefrigerator();
    }
}
