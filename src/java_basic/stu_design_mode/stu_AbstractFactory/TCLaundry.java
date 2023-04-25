package java_basic.stu_design_mode.stu_AbstractFactory;

public class TCLaundry implements LaundryMachine {
    @Override
    public String getMachineName() {
        return "this is Tc laundry";
    }

    @Override
    public void operationLaundry() {
        System.out.println("TC洗衣机的区别于其他电器的操作");
    }
}
