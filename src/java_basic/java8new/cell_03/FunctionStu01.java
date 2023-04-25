package java_basic.java8new.cell_03;

import org.junit.Test;

import java.util.function.Function;

//函数式接口
//参考文档
 // https://www.cnblogs.com/rever/p/9725173.html
public class FunctionStu01 {
    //1.接口Function<><T, R> 为函数式接口，T为输入类型参数，R为输出类型参数。
    // 2.使用@FunctionalInterface修饰.使用该注解有一个检查，
    // 即该接口只能有一个抽象方法。可以有其他默认方法。
    // 3.当接口只有一个抽象方法是，可以使用lambda表达式来创建一个对象。
    //
    @Test
    public void method(){
        Function<Integer,String>  ftn = integer -> integer+"abc";
        System.out.println(ftn.apply(123));
    }
}
