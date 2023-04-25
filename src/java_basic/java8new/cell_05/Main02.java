package java_basic.java8new.cell_05;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main02 {

    @Test
    public void method() {
        //4. sorted() / sorted((T, T) -> int)
        //如果流中的元素的类实现了 Comparable 接口，即有自己的排序规则，那么可以直接调用 sorted() 方法对元素进行排序，如 Stream<Integer>
        //反之, 需要调用 sorted((T, T) -> int) 实现 Comparator 接口
        List<People> list = Main01.getPeoples();
        List res = list.stream().filter( distinctByKey(people->people.getName())).
                sorted((o1, o2) -> o2.getAge()-o1.getAge()).
                collect(toList());
        System.out.println(res);
    }
    private <T> Predicate<T> distinctByKey(Function<? super T,?> raw){
        ConcurrentHashMap<Object,Boolean> contain = new ConcurrentHashMap<>();
        return data->contain.putIfAbsent(raw.apply(data),Boolean.TRUE)==null;
    }
    @Test
    public void method02() {
//        5. limit(long n)
//        返回前 n 个元素
//        6. skip(long n)
//        去除前 n 个元素
        List<People> list = Main01.getPeoples();
        List res = list.stream().limit(2).collect(toList());
        System.out.println(res);
    }

    @Test
    public void method03() {
        List<People> list = Main01.getPeoples();
        List res = list.stream().limit(4l).skip(2).collect(toList());
        System.out.println(res);
    }
    @Test
    public void method04() {
//        7. map(T -> R)
//        将流中的每一个元素 T 映射为 R（类似类型转换）
//        List<String> newlist = list.stream().map(Person::getName).collect(toList());
        List<People> list = Main01.getPeoples();
        List res = list.stream().map(people -> people.getName()).collect(toList());
        System.out.println(res);
    }
    @Test
    public void method05() {
//        8. flatMap(T -> Stream<R>)
//        将流中的每一个元素 T 映射为一个流，再把每一个流连接成为一个流

        List<String> list = new ArrayList<>();
        list.add("aaa bbb ccc");
        list.add("ddd eee fff");
        list.add("ggg hhh iii");
        list = list.stream().map(s -> s.split(" ")).flatMap(Arrays::stream).collect(toList());
        System.out.println(list);

        List<String> first= Arrays.asList("one", "two", "three", "four");
        List<String> second= Arrays.asList("A", "B", "C", "D");
        Stream.of(first,second).flatMap(Collection::stream).forEach(System.out::print);

    }
    @Test
    public void method06() {
//        9. anyMatch(T -> boolean)
//        流中是否有一个元素匹配给定的 T -> boolean 条件
//        是否存在一个 person 对象的 age 等于 20：
        List<People> list = Main01.getPeoples();
        boolean b = list.stream().anyMatch(people -> people.getAge() == 20);
        System.out.println("b===>"+b);//true

//        10. allMatch(T -> boolean)
//        流中是否所有元素都匹配给定的 T -> boolean 条件
        boolean b1 = list.stream().allMatch(people -> people.getAge() == 20);
        System.out.println("b1===>"+b1);
//        11. noneMatch(T -> boolean)
//        流中是否没有元素匹配给定的 T -> boolean 条件
        boolean b2 = list.stream().noneMatch(people -> people.getAge() == 20);
        System.out.println("b2===>"+b2);

    }

}
