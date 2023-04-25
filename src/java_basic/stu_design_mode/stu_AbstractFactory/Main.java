package java_basic.stu_design_mode.stu_AbstractFactory;

import org.junit.Test;

public class Main {
    @Test
    public void method() {
        //获取hair产品族工厂
        MachineFactory hr = new HairFactory();
        LaundryMachine lm = hr.getLaundry();
        lm.operationLaundry();//Hair洗衣机的区别于其他电器的操作
        System.out.println(lm.getMachineName());//this is hair laundry


        //获取TC产品族工厂
        MachineFactory tc = new TCFacory();
        TelevisionMachine tcs = tc.getTelevision();
        tcs.operationTelevision();//TC电视机的区别于其他电器的操作
        System.out.println(tcs.getMachineName());//this is TC television
    }
}
