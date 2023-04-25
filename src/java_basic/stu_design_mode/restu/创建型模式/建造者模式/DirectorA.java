package java_basic.stu_design_mode.restu.创建型模式.建造者模式;

import com.alibaba.fastjson.JSONObject;

public class DirectorA extends Director{
    public DirectorA(Builder builder) {
        super(builder);
    }
    @Override
    public Product construct(JSONObject jsonObject) {
        builder.buildPartA(jsonObject.getString("partA"));
        builder.buildPartB(jsonObject.getString("partB"));
        return builder.getProduct();
    }
}
