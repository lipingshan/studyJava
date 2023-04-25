package java_basic.stu_design_mode.restu.创建型模式.工厂模式.工厂方法;
//苹果手机工厂 用来生产苹果手机
public class ApplePhoneFactory implements PhoneFactory{
    @Override
    public Phone makePhone() {
        return new ApplePhone();
    }
}
