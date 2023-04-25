package java_basic.stu_design_mode.restu.创建型模式.建造者模式;

import com.alibaba.fastjson.JSONObject;

//抽象指挥者
public abstract class Director {
    protected Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public abstract Product construct(JSONObject jsonObject);
}
