package java_basic.genericity.cell_02;

import org.junit.Test;
//实现类为非泛型类。因为他类名后没有<T>！
public class Apple01 implements Fruit<String> {
    private String name;


    @Override
    public String getData(String s) {
        return name;
    }

    @Override
    public String setData(String s) {
        name=s;
        return name;
    }
    @Test
    public void method(){
        setData("xiao明");
        System.out.println(getData(""));
    }
}
