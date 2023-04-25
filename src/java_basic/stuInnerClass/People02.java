package java_basic.stuInnerClass;

import org.junit.Test;
import org.omg.CORBA.Object;

//匿名内部类的测试
public class People02 {
    @Test
    public void method() {
        subject.showMessage();//how are you.  //xxx
        animal.method();//method
        fruit.getNumber();//fruit geNumber
        fruit.toString();
    }


    //1.获取Subject类的匿名子类
    Subject subject = new Subject(){
        //里面的内容和子类集成一样的协防，可以重写父类方法，也可以不重写;
        @Override
        public void showMessage() {
            super.showMessage();
            method();
        }
        public void method(){//非重写方法外部无法访问，仅提供内部使用
            System.out.println("xxx");
        }
    };

    //2.获取接口的匿名实现
    Animal animal = new Animal() {
        @Override
        public void showMessage() {
            System.out.println("ShowMessae");
        }

        @Override
        public void method() {
            System.out.println("method");

        }

    };
    //3.当接口中只有一个方法时，可以通过lambda表达式简写
    //为了限制该接口只有一个自定义抽象方法，可以在该接口上加@FunctionalInterface
    //参考文档https://blog.csdn.net/qq_27610859/article/details/88861988
    Fruit fruit = () -> {

        System.out.println("fruit geNumber");
    };


}
//接口
interface Animal{
    void showMessage();//接口中的属性的默认是public static final 、方法是public abstract
    void method();
}

@FunctionalInterface
interface Fruit  {

    void getNumber();
    int hashCode();//Object 中的抽象方法可以再次出现 此处仅作为测试 并不知道其作用
    String toString();//Object 中的抽象方法可以再次出现 此处仅作为测试 并不知道其作用
    //String getName();//由于注解的缘故 在加一个自定义抽象方法，会报错。
}

//普通类
class Subject{
    public void showMessage(){
        System.out.println("how are you.");
    }
}
