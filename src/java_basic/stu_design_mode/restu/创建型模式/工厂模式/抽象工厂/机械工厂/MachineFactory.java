package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.机械工厂;


import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.Machine;

public interface MachineFactory {
    Machine getHaierMachine();
    Machine getTcMachine();
}
