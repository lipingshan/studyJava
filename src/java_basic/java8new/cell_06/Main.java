package java_basic.java8new.cell_06;


import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//参考文档
// https://www.cnblogs.com/rever/p/9773743.html
public class Main {
  @Test
  public void method() {

      Predicate<Integer> pa = data->data>5;
      Predicate<Integer> pb = data->data<20;
      Predicate<Integer> pc = data->data%2==0;
      Predicate<Integer> pe = data->data%2!=0;
      //and
      System.out.println(pa.and(pb).test(6));//true
      System.out.println(pa.and(pb).test(21));//false
      //or
      System.out.println(pa.or(pc).test(4));//true
      System.out.println(pa.or(pc).test(3));//false
      //negate
      System.out.println(pa.or(pe.negate()).test(4));//true
      System.out.println(pa.or(pc.negate()).test(4));//false
      //isEqual 输入的数据(test(t)中的t)是否等于 isEqual(x)中的
      System.out.println(Predicate.isEqual(5).test(5));//true
  }
  @Test
  public void method01() {
     List<Integer> source = Arrays.asList(12,3,4,1,23,4,351,53,6);
      Predicate<Integer> pa = data->data>5;
      Predicate<Integer> pb = data->data<20;
      Predicate<Integer> pc = data->data%2==0;
      Predicate<Integer> pe = data->data%2!=0;
      List res =source.stream().filter(pa.and(pc)).collect(Collectors.toList());
      System.out.println(res);
  }
}
