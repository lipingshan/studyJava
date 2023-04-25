package java_basic.java8new.cell_07;

import java_basic.java8new.cell_05.Main01;
import java_basic.java8new.cell_05.People;
import org.junit.Test;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;


public class Main {
//    Reduce 规约
//    这是一个最终操作，允许通过指定的函数来讲stream中的多个元素规约为一个元素，规越后的结果是通过Optional接口表示的：
    @Test
    public void method01() {
      List<People> list=  Main01.getPeoples();
      Optional<?> op =list.stream().reduce((people, people2) ->{
                  people.setAge(people2.getAge()+people.getAge());
                  return people;
              }
      );
        System.out.println(op.get());
    }

    @Test
    public void method02() {
        //此处，检测不出来stream与parallelStream的区别
        int max = 10000;
        List<String> list = new ArrayList(max);
        for(int i=0;i<max;i++){
            list.add(UUID.randomUUID().toString());
        }
        long t0 = System.nanoTime();

        long count = list.parallelStream().sorted().count();
        System.out.println(count);

        long t1 = System.nanoTime();

        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println(String.format("sequential sort took: %d ms", millis));
    }
    //Map
    //前面提到过，Map类型不支持stream，
    // 不过Map提供了一些新的有用的方法来处理一些日常任务。
    @Test
    public void method03() {
      Map<String,Object> map = new HashMap();
      for(int i=0;i<10;i++){
          map.put(String.valueOf(i),UUID.randomUUID().toString());
      }

      map.forEach((s, o) -> {
          System.out.println(s+"--"+o);
      });
        System.out.println(map.getOrDefault("3", "not found"));  // not found
       map.merge("3", "xxyyzz", (o, o2) -> o2);//o是原来的value值,o2是新加入的xxyyzz
        System.out.println(map.get("3"));
    }
}
