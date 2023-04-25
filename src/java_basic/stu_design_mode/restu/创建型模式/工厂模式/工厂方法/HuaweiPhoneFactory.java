package java_basic.stu_design_mode.restu.创建型模式.工厂模式.工厂方法;
//华为手机工厂 生产华为手机
public class HuaweiPhoneFactory implements PhoneFactory{
    @Override
    public Phone makePhone() {
        return new HuaweiPhone();
    }
}
