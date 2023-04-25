package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.机械工厂;

import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.*;

public class TelevisionMachineFactory implements MachineFactory{


    @Override
    public Machine getHaierMachine() {
        return new HaierTelevision();
    }

    @Override
    public Machine getTcMachine() {
        return new TcTelevision();
    }
}
