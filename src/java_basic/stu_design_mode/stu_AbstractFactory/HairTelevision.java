package java_basic.stu_design_mode.stu_AbstractFactory;

public class HairTelevision implements  TelevisionMachine {

    @Override
    public void operationTelevision() {
        System.out.println("Hair电视机的区别于其他电器的操作");
    }

    @Override
    public String getMachineName() {
        return "this is Hair television";
    }
}
