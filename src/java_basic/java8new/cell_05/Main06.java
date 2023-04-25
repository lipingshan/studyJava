package java_basic.java8new.cell_05;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.partitioningBy;

public class Main06 {
    //6. partitioningBy 分区
    //分区与分组的区别在于，分区是按照 true 和 false 来分的，因此partitioningBy 接受的参数的 lambda 也是 T -> boolean
    @Test
    public void method01() {
        List<People> list = Main01.getPeoples();

        Map<Boolean,List<People>> res =list.stream().collect(partitioningBy(p->p.getAge()==20));
        System.out.println("res===>"+res);
    }
}
