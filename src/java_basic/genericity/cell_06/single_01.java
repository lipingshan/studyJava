package java_basic.genericity.cell_06;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

//定义泛型数组
public class single_01 {

    @Test
    public void method(){
        String res[] =method_1("hellow","world");
        System.out.println(JSON.toJSON(res));
    }

    <T> T[] method_1(T ...arg){
        return arg;
    }

}
