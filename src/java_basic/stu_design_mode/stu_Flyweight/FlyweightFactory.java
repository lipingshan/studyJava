package java_basic.stu_design_mode.stu_Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
  * @Description //享元工厂
  * @Author lps
  * @Date 2020-08-23 09:14:14 星期日
  * @Version 1.0
  **/
public class FlyweightFactory {

    private Map<String,ConcreteFlyweight> flyweights = new HashMap<>();
    ConcreteFlyweight flyweight;
    ConcreteFlyweight getFlyweight(String key){
        flyweight = flyweights.get(key);
        if(flyweight==null){//不存在标识为key的flyweight对象，则创建
            flyweight = new ConcreteFlyweight(key);
            System.out.println("******创建新对象******");
            flyweights.put(key, flyweight);//将新的享元对象存入map集合中
        }else{
            System.out.println("******从flyweights中获取flyweight对象******");
        }
        return flyweight;
    }

}
