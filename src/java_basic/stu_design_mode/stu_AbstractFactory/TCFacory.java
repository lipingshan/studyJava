package java_basic.stu_design_mode.stu_AbstractFactory;

public class TCFacory implements MachineFactory {
    @Override
    public TelevisionMachine getTelevision() {
        return new TCTelevision();
    }

    @Override
    public LaundryMachine getLaundry() {
        return new TCLaundry();
    }
}
