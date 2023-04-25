package java_basic.stu_reflect.cell01;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class Main {
    @Test
    public void method() throws IOException {

        Properties pro=Init.getPro();
        System.out.println(pro.getProperty("apple"));
        Fruit f=Factory.getInstance(pro.getProperty("apple"));
        if(f!=null){
            f.eat("xxx");
        }
    }



}
