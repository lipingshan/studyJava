package java_basic.java8new.cell_05.test;

import org.junit.Test;

import java.util.function.Function;
//1.尝试创建一个方法ftn，该方法接受接口为参数，并在ftn中执行该接口实例对象中的方法
//        要求该接口为只有1个抽象方法。
//        方法ftn 类似 Collections.sort(list, (o1, o2) ->{});
public class TestDemo01 {
    @Test
    public void method(){
       Integer res = ftn(data->data*2,3);// 类似 Collections.sort(list, (o1, o2) ->{});
        System.out.println("res==>"+res);
    }

    public Integer ftn(Function<Integer,Integer> obj,Integer input){
       return obj.apply(input);
    }
}
