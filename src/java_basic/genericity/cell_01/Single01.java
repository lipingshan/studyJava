package java_basic.genericity.cell_01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Single01 {
    @Test
    public void method(){
        List<String> list = new ArrayList();
        list.add("abc");
        list.add("eee");
        list.add("fff");
        //在创建集合的时候，我们明确了集合的类型了，所以我们可以使用增强for来遍历集合！
        for(String cur:list){
            System.out.println(cur);
        }
    }

    @Test
    public void Package(){
        Map<String,String> mp1=Maper("abc");
        Map<String,Integer> mp2 = Maper(123);
        String m1 = mp1.get("key");
        int m2 = mp2.get("key");
        System.out.println(m1);
        System.out.println(m2);
    }

    //泛型方法
    public <T> Map<String, T> Maper(T t){
        Map<String,T> map = new HashMap<>();
        map.put("key",t);
        return map;
    }
}
