package java_basic.stu_design_mode.restu.创建型模式.建造者模式;

import com.alibaba.fastjson.JSONObject;

public class BuilderPattern {
    public static void main(String[] args) {
        JSONObject jsonObject= new JSONObject();
        jsonObject.put("partA","this is partA");
        jsonObject.put("partB","this is partB");
        jsonObject.put("partC","this is partC");

        // 只初始化 partA partB
        Builder builder = new ConcreteBuilder();
        Director director = new DirectorA(builder);
        // 此处注意product 是来自builder
        Product product = director.construct(jsonObject);
        product.show();

        // 只初始化 partA partC
        System.out.println("##################");
        Builder builder1 = new ConcreteBuilder();
        Director director1 = new DirectorB(builder1);
        // 注意如果此处使用builder，则表示product 是同一个对象，即此处会在前一个product的基础上继续set
        Product product1 = director1.construct(jsonObject);
        product1.show();

    }
}
