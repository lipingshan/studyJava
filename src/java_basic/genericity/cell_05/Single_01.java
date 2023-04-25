package java_basic.genericity.cell_05;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Single_01 {
    //json 与对象互转
    @Test
    public void method(){
        //对象转为json
       Object opa = getJson();

        System.out.println(opa.toString());
        //json转为对象
        List<Person> resObj = JSON.parseArray(opa.toString(),Person.class);
        System.out.println(resObj.get(0).getName());
    }

    //现在将
//    List<Person> resObj = JSON.parseArray(opa.toString(),Person.class);
//        System.out.println(resObj.get(0).getName());
    //改装成泛型，即用T替换掉Person,用Class<T> 来作为Person.class的泛型参数

    public <T> List<T>  method2(Class<T> obj){
        Object opa = getJson();
        List<T> resObj = JSON.parseArray(opa.toString(),obj);
        return resObj;
    }

    @Test
    public void method3(){
        List<Person> res =method2(Person.class);
        System.out.println(res.get(0).getName());
    }

    public Object getJson(){
        Person person = new Person("小明",22);

        List<Person> pa = new ArrayList();
        person.setName("小张");
        pa.add(person);
        Person person_ =  new Person("",24);
        person_.setName("小王");
        pa.add(person_);
        Object opa = JSON.toJSON(pa);
        return opa;
    }
}
