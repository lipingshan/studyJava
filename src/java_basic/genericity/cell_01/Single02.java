package java_basic.genericity.cell_01;

import org.junit.Test;
/**
 * 参考文档：
 * https://www.cnblogs.com/lwbqqyumidi/p/3837629.html
 * 1.Box<Number>和Box<Integer>实际上都是Box类型;
 * 2.Box<Number>在逻辑上不能视为Box<Integer>的父类;
 * 3.我们需要一个在逻辑上可以用来表示同时是Box<Integer>和Box<Number>的父类的一个引用类型，
 * 由此，类型通配符应运而生
 *
 **/
public class Single02 {
    @Test
    public void method(){
        Box<String> name = new Box<String>("corn");
        Box<Integer> age = new Box<Integer>(712);
        Box<Number> number = new Box<Number>(314);

        getData(name);
        getData(age);
        getData(number);

        //getUpperNumberData(name);
        getUpperNumberData(age);
        getUpperNumberData(number);

        //getLowerNumberData(name);
        getLowerNumberData(age);
        getLowerNumberData(number);
    }
    //通配符
    public static void getData(Box<?> data) {
        System.out.println("data :" + data.getData());
    }
    //通配符上限
    public static void getUpperNumberData(Box<? extends Number> data){

        System.out.println("data :" + data.getData());
    }
    //通配符下限  Box<? super Number>表示类型只能接受Number及其三层父类类型
    public static void getLowerNumberData(Box<? super Integer> data){
        System.out.println("data :" + data.getData());
    }

}
