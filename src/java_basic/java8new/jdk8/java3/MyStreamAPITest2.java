package java_basic.java8new.jdk8.java3;

import java_basic.java8new.jdk8.java2.Employee;
import java_basic.java8new.jdk8.java2.EmployeeData;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 测试Stream的终止操作
 *
 * @author shkstart
 * @create 2019 下午 6:37
 */
public class MyStreamAPITest2 {

    //1-匹配与查找
    @Test
    public void test1(){
        List<Employee> employees = EmployeeData.getEmployees();

        boolean b = employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println(b);

        boolean b1 = employees.stream().anyMatch(e -> e.getSalary() > 100000);
        System.out.println(b1);

        boolean b2 = employees.stream().noneMatch(e -> e.getName().startsWith("雷"));
        System.out.println(b2);

        Optional<Employee> first1 = employees.stream().sorted(((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()))).findFirst();
        System.out.println(first1);
        Optional<Employee> first = employees.stream().findFirst();
        System.out.println(first);

        Optional<Employee> any = employees.stream().findAny();
        System.out.println(any);
        Optional<Employee> any1 = employees.parallelStream().findAny();
        System.out.println(any1);
        System.out.println(any1.get().getName());

    }

    @Test
    public void test2(){

        List<Employee> employees = EmployeeData.getEmployees();
        long count = employees.stream().filter(e -> e.getSalary() > 5000).count();
        System.out.println(count);

        Optional<Employee> max = employees.stream().max((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary()));
        System.out.println(max);

        Optional<Double> max1 = employees.stream().map(Employee::getSalary).max((o1, o2) -> Double.compare(o1, o2));
        System.out.println(max1);

        Optional<Employee> min = employees.stream().min(((o1, o2) -> Double.compare(o1.getSalary(), o2.getSalary())));
        System.out.println(min);

        Optional<Double> min1 = employees.stream().map(Employee::getSalary).min(Double::compareTo);
        System.out.println(min1);

    }


    @Test
    public void test3(){
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        System.out.println("=================");
        List<Employee> employees = EmployeeData.getEmployees();
        Double reduce1 = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);
        System.out.println(reduce1);
        Optional<Double> reduce2 = employees.stream().map(Employee::getSalary).reduce(Double::sum);
        System.out.println(reduce2);

       //Optional<Employee> reduce2 = employees.stream().reduce((o1, o2) -> o1.getSalary()+o2.getSalary());
    }

    @Test
    public void test4(){
        List<Employee> employees = EmployeeData.getEmployees();
        List<Employee> collect = employees.stream().filter(employee -> employee.getSalary() > 5000).collect(Collectors.toList());
        System.out.println(collect);

        Set<Employee> collect1 = employees.stream().filter(employee -> employee.getSalary() > 5000).collect(Collectors.toSet());
        System.out.println(collect);
    }

}
