package java_basic.java8new.cell_04;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Single01 {


    @Test
    public void method(){
        Converter<String,Integer> cv= input -> Integer.valueOf(input);
        System.out.println( cv.convert("123"));//123
        Converter<String,Integer> cv_= Integer::valueOf;
        System.out.println(cv_.convert("123"));//123
    }
    @Test
    public void method01(){
//1引用构造函数
        PersonFactory<Person> pf = (firstName, lastName) ->new Person(firstName,lastName);
        Person person =pf.create("明明","小明");
       // System.out.println(person.getFirstName());

        //我们只需要使用 Person::new 来获取Person类构造函数的引用，
        //Java编译器会自动根据PersonFactory.create方法的签名来选择合适的构造函数。
        PersonFactory<Person> pf_ =Person::new;
        Person person_ =pf_.create("明明","小明");
       // System.out.println(person_.getFirstName());
        Supplier<Person> sup = () -> new Person();
        Person pp=sup.get();
        pp.setFirstName("kangkang");
        System.out.println(pp.getFirstName());
        System.out.println(sup.get()==sup.get());//false
//2引用静态方法
        Other<String> other = Person::showMessage;
        System.out.println(other.apply("hello world"));
//3.引用实例方法
        Obj<String> obj= new Person("李白","太白")::getFirstName;
        System.out.println(obj.getData());
        List lit = new ArrayList<String>();

        Consumer<Integer> cs = input-> lit.add(Math.random()*input);
        cs.andThen(cs).andThen(cs).andThen(cs).accept(10);
        System.out.println(JSON.toJSON(lit).toString());

       List<Integer> lits = new ArrayList();
        lits.add(123);
        lits.add(234);
       lits.forEach(integer -> {
           System.out.println(integer);
       });
        List<String> li = new ArrayList();
        li.add("hello");
        li.add("world");
       li.forEach(new Person()::showMessage_);
    }


}
