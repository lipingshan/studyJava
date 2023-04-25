package java_basic.java8new.cell_05;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

//汇总
public class Main05 {
    @Test
    public void method01() {
        List<People> list = Main01.getPeoples();
        //统计元素个数。count
        long sum = list.stream().count();
        System.out.println("sum="+sum);
        //属性求和。mapToInt(x->x.getAge()).sum()
        System.out.println( list.stream().mapToInt(x->x.getAge()).sum());
        //属性求平均数
        System.out.println(list.stream().mapToInt(x->x.getAge()).average().getAsDouble());

    }
    @Test
    public void method02() {
        List<People> list = Main01.getPeoples();
        //统计元素个数。count
//        summarizingInt，summarizingLong，summarizingDouble
//        这三个方法比较特殊，比如 summarizingInt 会返回 IntSummaryStatistics 类型
      DoubleSummaryStatistics statistics = list.stream().collect(summarizingDouble(x->x.getAge()));
        System.out.println( JSON.toJSON(statistics).toString());
    }
    //取最值  与上面的不同 上面可以求年龄的最大最小，均值等
    //此处是 求取年龄最大的那个people
//    maxBy，minBy 两个方法，需要一个 Comparator 接口作为参数
//    Optional<Person> optional = list.stream().collect(maxBy(comparing(Person::getAge)));
//    我们也可以直接使用 max 方法获得同样的结果
//    Optional<Person> optional = list.stream().max(comparing(Person::getAge));

    @Test
    public void method03() {
        List<People> list = Main01.getPeoples();
        Optional<People> optional = list.stream().max(comparing(x->x.getAge()));
        System.out.println(optional.get().toString());
        Optional<People> optional_ = list.stream().collect(maxBy(comparing(x->x.getAge())));
        System.out.println(optional_.get().toString());

    }
    //joining
    @Test
    public void method04() {
        List<People> list = Main01.getPeoples();
        String res =list.stream().map(x->x.getName()).collect(joining("||"));
        System.out.println("res===>"+res);//jack||jack||jack||mike||tom

        String res_ =list.stream().map(x->x.getName()).collect(joining("||","start--","--end"));
        System.out.println("res_===>"+res_);//start--jack||jack||jack||mike||tom--end
    }

    @Test
    public void method05() {
//        5. groupingBy 分组
//        groupingBy 用于将数据分组，最终返回一个 Map 类型
//        Map<Integer, List<Person>> map = list.stream().collect(groupingBy(Person::getAge));
//        例子中我们按照年龄 age 分组，每一个 Person 对象中年龄相同的归为一组
//        另外可以看出，Person::getAge 决定 Map 的键（Integer 类型），list 类型决定 Map 的值（List<Person> 类型）
        List<People> list = Main01.getPeoples();
        //返回Map<String, List<People>>
        LinkedHashMap<String, List<People>> map = list.stream().collect(groupingBy(People::getName,LinkedHashMap::new,toList()));
       System.out.println(JSON.toJSON(map).toString());

       Map<String, Long> map_=list.stream().collect(Collectors.groupingBy(x->x.getName(), Collectors.counting()));
        System.out.println(JSON.toJSON(map_).toString());//{"mike":1,"jack":3,"tom":1}
        String keyName;
        List<Integer> curAge;
        Map<String,List<Integer>> resMap = new LinkedHashMap();
        for(Map.Entry<String,List<People>> cur: map.entrySet()){
            keyName=cur.getKey();
            curAge = cur.getValue().stream().map(x->x.getAge()).collect(toList());
            resMap.put(keyName,curAge);
       }
        System.out.println("resMap===>"+resMap);

    }
}
