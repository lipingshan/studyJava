package java_basic.stuInnerClass;

import org.junit.Test;

public class Main extends People {


    @Test
    public void method01(){


        int a = 123;
        System.out.println(new People().age);
        //其他类访问匿名内部类
        People.Man pm = new People().new Man();
        System.out.println(pm.showMessage());
        new C().method();
    }
    class X extends People{

    }

    class A{
        public void method(){
            System.out.println("xx");
        }
    }
    interface B{
        public void method();
    }
    class C extends A implements B{

    }

}
