package java_basic.java8new.cell_05;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
//4.使用过滤器来实现去重。
//思路是去定义一个函数<T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor)
//该函数参数是一个函数式接口的对象，重写方法的内容为获取流元素(people对象)的某一个属性
public class Main01 {
    @Test
    public void method() {
        //如果我们想要按照对象的属性，对对象列表进行去重，我们可以通过其它方法来实现。
        List<People> list = getPeoples();
        List res2 = list.stream().
                filter( distinctByKey(b -> b.getName())).
                collect(Collectors.toList());
        System.out.println(res2);
    }

    public static List<People> getPeoples(){
        List<People> list = new ArrayList<>();
        list.add(new People("jack", 20));
        list.add(new People("jack", 20));
        list.add(new People("jack", 30));
        list.add(new People("mike", 25));
        list.add(new People("tom", 30));
        return list;
    }


    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        //ConcurrentHashMap中的putIfAbsent方法的使用以及返回值的含义
        //https://blog.csdn.net/hbtj_1216/article/details/75093428

        //System.out.println("xxxx");//只执行一次
        Map<Object,Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

}
