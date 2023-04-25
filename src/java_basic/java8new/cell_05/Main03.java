package java_basic.java8new.cell_05;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main03 {
  @Test
  public void method01() {
//      12. findAny() 和 findFirst()
//      findAny()：找到其中一个元素 （使用 stream() 时找到的是第一个元素；使用 parallelStream() 并行时找到的是其中一个元素）
//      findFirst()：找到第一个元素
//      值得注意的是，这两个方法返回的是一个 Optional<T> 对象，它是一个容器类，能代表一个值存在或不存在，这个后面会讲到
      List<People> list = Main01.getPeoples();
      System.out.println(list.stream().findFirst().toString());

  }
  @Test
  public void method02() {
      List<People> list = Main01.getPeoples();
//      13. reduce((T, T) -> T) 和 reduce(T, (T, T) -> T)
//      用于组合流中的元素，如求和，求积，求最大值等
//      计算年龄总和：
      int sum = list.stream().map(x->x.getAge()).reduce(0, (a, b) -> a + b);
      System.out.println("sum===>"+sum);
//      与之相同:
      int sum_ = list.stream().map(x->x.getAge()).reduce(0, Integer::sum);
      System.out.println("sum_===>"+sum_);
//      其中，reduce 第一个参数 0 代表起始值为 0，lambda (a, b) -> a + b 即将两值相加产生一个新值
//      同样地：
//      计算年龄总乘积：
      int sum_1 = list.stream().map(x->x.getAge()).reduce(1, (a, b) -> a * b);
      System.out.println("sum_1===>"+sum_1);
      System.out.println(list.stream().map(x->x.getAge()).reduce(0, (a, b) -> a * b));//o
  }
  @Test
  public void method03() {
//      13. count()
//      返回流中元素个数，结果为 long 类型
      List<People> list = Main01.getPeoples();
      System.out.println(list.stream().count());
//      14. collect()
//      收集方法，我们很常用的是 collect(toList())，当然还有 collect(toSet()) 等，参数是一个收集器接口，这个后面会另外讲
//      15. forEach()
//      返回结果为 void
    //  打印各个元素：
      list.stream().forEach(System.out::println);
      int []arr1= {45,34,59,55};
      Arrays.sort(arr1);//调用方法排序即可
      System.out.println(JSON.toJSON(arr1).toString());

  }

  //参考文档
//https://www.jianshu.com/p/e429c517e9cb
  @Test
  public void method04() {
      List<People> list = Main01.getPeoples();
//     1 流转换为数值流 便于运算
//      mapToInt(T -> int) : return IntStream
//      mapToDouble(T -> double) : return DoubleStream
//      mapToLong(T -> long) : return LongStream
      IntStream intStream = list.stream().mapToInt(people->people.getAge());
//      2. 数值流方法
//      下面这些方法作用不用多说，看名字就知道：
//
//      sum()
//      max()
//      min()
//      average() 等...
      int res = intStream.sum();
      System.out.println("res===>"+res);//125
      System.out.println(list.stream().mapToInt(people->people.getAge()).max());
      System.out.println(list.stream().mapToInt(people->people.getAge()).average());



//      数值流转换为流
//      很简单，就一个 boxed
//
//      Stream<Integer> stream = intStream.boxed();
      Stream<Integer> stream = list.stream().mapToInt(people->people.getAge()).boxed();
      System.out.println(stream.collect(toList()));

  }
  @Test
  public void method05() {
//      IntStream 与 LongStream 拥有 range 和 rangeClosed 方法用于数值范围处理
//
//      IntStream ： rangeClosed(int, int) / range(int, int)
//      LongStream ： rangeClosed(long, long) / range(long, long)
//      这两个方法的区别在于一个是闭区间，一个是半开半闭区间：
//
//      rangeClosed(1, 100) ：[1, 100]
//      range(1, 100) ：[1, 100)
//      我们可以利用 IntStream.rangeClosed(1, 100) 生成 1 到 100 的数值流

      IntStream intStream = IntStream.rangeClosed(1, 10);

      int sum = intStream.sum();
      System.out.println("sum==>"+sum);
  }
  @Test
  public void method06() throws IOException {
      //构建流
      //之前我们得到一个流是通过一个原始数据源转换而来，其实我们还可以直接构建得到流。

     // 1. 值创建流
//      Stream.of(T...) ： Stream.of("aa", "bb") 生成流
//              生成一个字符串流
      //Stream.empty() : 生成空流
      Stream stream = Stream.of("aaa","bbb","cccc");
      System.out.println(stream.collect(toList()));

//      2. 数组创建流
//      根据参数的数组类型创建对应的流：
//
//      Arrays.stream(T[ ])
//      Arrays.stream(int[ ])
//      Arrays.stream(double[ ])
//      Arrays.stream(long[ ])
//      值得注意的是，还可以规定只取数组的某部分，用到的是Arrays.stream(T[], int, int)

//      只取索引第 1 到第 2 位的：
      int[] a = {1, 2, 3, 4};
      Arrays.stream(a, 1, 3).forEach(System.out :: println);
//      打印 2 ，3


     // 3. 文件生成流
      Stream<String> s= Files.lines(Paths.get("E:\\idea\\svn\\repositorylocation\\studyJava\\src\\java_basic\\java8new\\cell_05\\data.txt"));
      System.out.println(s.collect(toList()));
   //   每个元素是给定文件的其中一行


//      4. 函数生成流
//      两个方法：
//      iterate ： 依次对每个新生成的值应用函数
//      generate ：接受一个函数，生成一个新的值
    //  System.out.println(Stream.iterate(0, n -> n + 2).limit(20).collect(toList()));
//      生成流，首元素为 0，之后依次加 2

      System.out.println(Stream.iterate(4,n->n+3).limit(4).collect(toList()));
     // System.out.println(Stream.generate(Math :: random).limit(20).collect(toList()));
//      生成流，为 0 到 1 的随机双精度数
      System.out.println(Stream.generate(() -> Math.floor(Math.random()*10)).limit(20).collect(toList()));
      Stream.generate(() -> 1);
//      生成流，元素全为 1
  }


}
