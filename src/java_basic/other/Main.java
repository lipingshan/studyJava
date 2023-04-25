package java_basic.other;
import java_basic.stuInnerClass.People;
import org.junit.Test;

public class Main extends People {
    public void method01() {
       People.Man man = new People().new Man();
    }


    @Test
    public void method() {
        String a = "    ";
        System.out.println("a==>"+a.length());//4
        System.out.println(a.trim().equals(""));//true
        System.out.println("a===>"+a.trim().length());//0


    }
}
