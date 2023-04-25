package java_basic.genericity.cell_03;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//泛型函数

//怎么单独在一个函数里使用泛型。
// 比如我们在新建一个普通的类StaticFans，然后在其中定义了两个泛型函数
//参考文档https://www.cnblogs.com/jpfss/p/9928747.html
public class Nomal {
    @Test
    public void method(){
        //静态泛型调用
        Nomal.showData("apple","fruit","strawberry","pear");
        Nomal.showData(123,234,222,444);
        Nomal.<Integer,String>showData(111,333,222,444);//方法调用推荐使用

        //动态泛型调用
        new Nomal().getData("apple","fruit","strawberry","pear");
        new Nomal().<String,Integer>getData("apple","fruit","strawberry","pear");//推荐
    }

    //静态泛型
    public static <T,U> void  showData(T ...args){
        List<T> list = new ArrayList();
        for ( T p : args){
            list.add(p);
        }
        System.out.println(list);
    }
    //动态泛型
    public  <T,U> void  getData(T ...args){
        List list = Arrays.asList(args);
        Collections.sort(list,((o1, o2) -> {
            if(o1 instanceof String&& o2 instanceof String){
                if(((String) o1).length()>((String) o2).length()){
                    return 1;
                }else if(((String) o1).length()>((String) o2).length()){
                    return 0;
                }else{
                    return -1;
                }
            }else{
                return 0;
            }
        }));
        System.out.println(list);
    }


}
