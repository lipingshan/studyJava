package java_basic.java8new.jdk8.java3;

import java_basic.java8new.jdk8.java2.Employee;
import java_basic.java8new.jdk8.java2.EmployeeData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Stream;

/**
 * 测试Stream的中间操作
 *
 * @author shkstart
 * @create 2019 下午 4:42
 */
public class MyStreamAPITest1 {

    //1-筛选与切片
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();
//        filter(Predicate p)——接收 Lambda ， 从流中排除某些元素。
        Stream<Employee> stream = list.stream();
        //练习：查询员工表中薪资大于7000的员工信息
        stream.filter(e -> e.getSalary() > 7000).forEach(System.out::println);

        System.out.println();
//        limit(n)——截断流，使其元素不超过给定数量。
        list.stream().limit(3).forEach(System.out::println);
        System.out.println();

//        skip(n) —— 跳过元素，返回一个扔掉了前 n 个元素的流。若流中元素不足 n 个，则返回一个空流。与 limit(n) 互补
        list.stream().skip(3).forEach(System.out::println);
        System.out.println();
//        distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素

        list.add(new Employee(1010,"刘强东",40,8000));
        list.add(new Employee(1010,"刘强东",41,8000));
        list.add(new Employee(1010,"刘强东",40,8000));
        list.add(new Employee(1010,"刘强东",40,8000));
        list.add(new Employee(1010,"刘强东",40,8000));

//        System.out.println(list);

        list.stream().distinct().forEach(System.out::println);
    }

    //映射
    @Test
    public void test2(){

        List<String> a = new ArrayList<>();

        TreeMap<String,Object> treeMap = new TreeMap();


//        map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        list.stream().map(str -> str.toUpperCase()).forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().map(Employee::getName).filter(name -> name.length()>3).forEach(System.out::println);

        System.out.println("*****************");

        Stream<Stream<Character>> streamStream = list.stream().map(MyStreamAPITest1::formsdlkfa);
        streamStream.forEach(s -> {
            s.forEach(System.out::println);
        });

        System.out.println();
        list.stream().flatMap(MyStreamAPITest1::formsdlkfa).forEach(System.out::println);

    }

    public static Stream<Character> formsdlkfa(String string){
        ArrayList<Character> list = new ArrayList<>();
        for (Character a: string.toCharArray()){
            list.add(a);
        }
        return list.stream();

    }


    @Test
    public void test3(){

        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        //list1.add(list2);
        list1.addAll(list2);
        System.out.println(list1);

    }

    @Test
    public void test4(){
        List<Integer> list = Arrays.asList(12, 43, 65, 34, 87, 0, -98, 7);
        list.stream().sorted().forEach(System.out::println);

        List<Employee> employees = EmployeeData.getEmployees();
        employees.stream().sorted((o1, o2) -> Integer.compare(o1.getAge(),o2.getAge())).forEach(System.out::println);

    }

}
