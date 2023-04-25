package java_basic.stu_design_mode.restu.结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;
//享元工厂
public class FlyweightFactory {
    private Map<String,FlyWeight> flyWeights = new HashMap<>();
    private FlyWeight flyWeight;
    FlyWeight getFlyweight(String key){
        flyWeight=flyWeights.get(key);
        if(flyWeight==null){
            flyWeight = new ConcreteFlyweight(key);
            flyWeights.put(key,flyWeight);
            System.out.println("创建新的享元对象 key="+key);
        }else{
            System.out.println("使用已有的享元对象 key="+key);
        }
            return flyWeight;
    }
}
