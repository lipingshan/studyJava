package java_basic.stu_design_mode.stu_AbstractFactory;

public class TCTelevision implements TelevisionMachine {
    @Override
    public String getMachineName()  {
        return "this is TC television";
    }

    @Override
    public void operationTelevision() {
        System.out.println("TC电视机的区别于其他电器的操作");
    }
}
