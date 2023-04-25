package java_basic.java8new.cell_05;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

public class Main04 {
    @Test
    public void method01() {
     //   四. collect 收集数据
    //    coollect 方法作为终端操作，接受的是一个 Collector 接口参数，能对数据进行一些收集归总操作

       // 1. 收集
      //  最常用的方法，把流中所有元素收集到一个 List, Set 或 Collection 中

        // toList// toSet// toCollection// toMap
        List<People> list = Main01.getPeoples();
//toMap 如果 Map 的 Key 重复了，可是会报错的哦
        Map<String,People> map = list.stream().filter(distinByKey(x->x.getName())).collect(toMap(x->x.getName(),x->x));
        System.out.println(map);
//toSet
        System.out.println( list.stream().collect(toSet()));
    }

    private <T> Predicate<T> distinByKey(Function<? super T,?> handle){
        ConcurrentHashMap ch = new ConcurrentHashMap();
        return rs->ch.putIfAbsent(handle.apply(rs),Boolean.TRUE)==null;
    }
    @Test
    public void method02() {
        List<String> list = Arrays.asList("java", "python", "C++","php","java");
        //直接将输出结果拼接
        System.out.println(list.stream().collect(Collectors.joining()));
        //每个输出结果之间加拼接符号“|”
        System.out.println(list.stream().collect(Collectors.joining(" | ")));
        //输出结果开始头为Start--，结尾为--End，中间用拼接符号“||”
        System.out.println(list.stream().collect(Collectors.joining(" || ", "Start--", "--End")));


    }
}
