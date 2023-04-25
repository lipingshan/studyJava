package java_basic.stu_design_mode.stu_Flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcreteFlyweight implements Flyweight {
    //对象一旦创建，这些数据的值根据key来判断是否需要创建新对象
    private String key;//唯一标识
    //这部分数据值，在对象创建后就不变了
    private String weight;
    private String height;
    private String[] hobby;

    //这部分数据值，可以随着业务而改变
    private String attribute;

    ConcreteFlyweight(String key){//享元工厂中需要
        this.key = key;
    }

    @Override
    public void operation(UnsharedConcreteFlyweight outer) {
        String Attribute = outer.getAttribute();
        if(Attribute!=null){
            this.attribute = Attribute;
            System.out.println("随着外部数据的引入，对象存在数据更新：attribute->"+attribute);
        }
        String info = outer.getInfo();
        if(info!=null){
            System.out.println("锁着外部数据的引入，内、外部数据的相互作用：attribute->info:"+attribute+"->"+info);
        }


    }
}
