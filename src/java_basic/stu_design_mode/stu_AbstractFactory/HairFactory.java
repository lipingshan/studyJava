package java_basic.stu_design_mode.stu_AbstractFactory;

public class HairFactory implements MachineFactory {
    @Override
    public TelevisionMachine getTelevision() {
        return new HairTelevision();
    }

    @Override
    public LaundryMachine getLaundry() {
        return new HairLaundry();
    }
}
