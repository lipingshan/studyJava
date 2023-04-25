package java_basic.genericity.cell_02;

import org.junit.Test;
//使用泛型类来继承泛型接口的作用就是让用户来定义接口所使用的变量类型，
// 而不是像方法一那样，在类中写死。
public class Banana02<T,U> implements Fruit<T> {
    private T name;
    private U sex;
    @Override
    public T getData(T t) {
        return name;
    }

    @Override
    public T setData(T t) {
        return name=t;
    }
    public void setSex(U u){
        sex = u;
        System.out.println("sex==>"+sex);
    }
    @Test
    public void method(){
       Fruit<Integer> banana= new Banana02();
       banana.setData(123);
       Integer res = banana.getData(0);
        System.out.println(res);

        Banana02<Integer,String> ban= new Banana02();
        ban.setSex("男");
    }
}
