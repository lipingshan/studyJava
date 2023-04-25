package java_basic.java8new.cell_05;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    @Test
    public void method(){
        List<Person> list = new ArrayList<>();
        list.add(new Person("jack", 20));
        list.add(new Person("jack", 20));
        list.add(new Person("jack", 30));
        list.add(new Person("mike", 25));
        list.add(new Person("tom", 30));
        //Predicate 接口参考文档
        // https://www.cnblogs.com/rever/p/9773743.html
        Predicate<Integer> pd = x->x>6;
        Predicate<Integer> ps = y->y<10;
        System.out.println(pd.and(ps).test(8));
        System.out.println("*********filter(T -> boolean)**********************");
//2.filter(T -> boolean)//过滤，保留 boolean 为 true 的元素
        List res = list.stream().filter(person->person.getAge()==20||person.getAge()==30).collect(Collectors.toList());
        System.out.println(res);
        System.out.println("*********distinct()**********************");
//3. distinct()
        //去除重复元素，这个方法是通过类的hashCode equals 方法来判断两个元素是否相等的
       //参考文档https://blog.csdn.net/puppylpg/article/details/78556730
        List res1 = list.stream().
                distinct().
                collect(Collectors.toList());
        System.out.println(res1);



    }

}
