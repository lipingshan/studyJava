package java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.品牌工厂;

import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.RefrigeratorMachine;
import java_basic.stu_design_mode.restu.创建型模式.工厂模式.抽象工厂.TelevisionMachine;
//按机械分 有 电视机、电冰箱，再接着按品牌分为haier、TC
//工厂的顶端接口表示每个工厂可以生产两种机械:电视机、电冰箱
public interface BrandFactory {//可以理解为品牌工厂中有两种机械
    TelevisionMachine getTelevision();
    RefrigeratorMachine getRefrigerator();
}
