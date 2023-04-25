package java_basic.java8new.cell_05.test;

import org.junit.Test;

import java.util.function.Predicate;

public class TestDemo02 {
//    2.验证接口Predicate<T>
//    参考文档 https://www.cnblogs.com/rever/p/9773743.html
    @Test
    public void method(){
        Predicate<Integer> pd = x->x>6;
        Predicate<Integer> ps = y->y<10;
        System.out.println(pd.and(ps).test(8));
    }
}
