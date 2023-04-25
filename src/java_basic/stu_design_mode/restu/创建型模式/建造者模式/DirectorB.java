package java_basic.stu_design_mode.restu.创建型模式.建造者模式;

import com.alibaba.fastjson.JSONObject;

public class DirectorB extends Director{
    public DirectorB(Builder builder) {
        super(builder);
    }
    @Override
    public Product construct(JSONObject jsonObject) {
        builder.buildPartA(jsonObject.getString("partA"));
        builder.buildPartC(jsonObject.getString("partC"));
        return builder.getProduct();
    }
}
