package java_basic.genericity.cell_04;

import org.junit.Test;

//返回值为泛型
public class Return {
    @Test
    public void method(){
        System.out.println(demo().getData());
        System.out.println(demo().showData());//返回值为泛型
    }
    public Person<String, Integer, Double, Integer> demo(){
       Person<String,Integer,Double,Integer> person =  new Person("xiao明",20,22.3,15);
       return person;
    }
}
