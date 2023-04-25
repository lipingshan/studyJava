package java_basic.stu_design_mode.stu_AbstractFactory;

public class HairLaundry implements LaundryMachine {
    @Override
    public String getMachineName() {
        return "this is hair laundry";
    }

    @Override
    public void operationLaundry() {
        System.out.println("Hair洗衣机的区别于其他电器的操作");
    }
}
