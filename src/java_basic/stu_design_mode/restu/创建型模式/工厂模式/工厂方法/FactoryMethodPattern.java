package java_basic.stu_design_mode.restu.创建型模式.工厂模式.工厂方法;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        PhoneFactory applePhoneFactory = new ApplePhoneFactory();
        Phone apple = applePhoneFactory.makePhone();
        apple.show();

        PhoneFactory huaweiPhoneFactory = new HuaweiPhoneFactory();
        Phone huawei= huaweiPhoneFactory.makePhone();
        huawei.show();
    }
}
