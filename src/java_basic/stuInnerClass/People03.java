package java_basic.stuInnerClass;

import org.junit.Test;

import java.util.function.Function;

public  class People03 {
    public static <T,R> void CallBack(Function<T,R> fnt,T t){
        fnt.apply(t);
    }
    @Test
    public void method() {
        People03.CallBack((Function<Integer, Object>) o ->(o*10),23);
    }
}


