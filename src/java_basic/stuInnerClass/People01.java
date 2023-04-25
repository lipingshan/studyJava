package java_basic.stuInnerClass;

import org.junit.Test;

//局部内部类
public class People01 {
    @Test
    public  void method() {

        showMessage().getNumber();

    }
    private String name = "小明";
    public  OBJ showMessage(){
         int num = 10;
        class inner extends OBJ{
            //String name = "小军";//局部内部类的属性如果和外部类同名，则会隐藏外部属性。
            //static String abc="";//报错
            int score  = 100;
            public void getNumber(){
                String name = "小军1";//
                int mark = 23;
                //局部内部类可以直接访问外部类的属性，即便是private
                // 局部内部类的属性如果和外部类同名，则会隐藏外部属性。
                System.out.println(name);//小军1
                //解决办法
                System.out.println(People01.this.name);//小明
                System.out.println(num);//版本更新，访问已经可以不用final修饰的外部方法了。
                System.out.println(score);
                System.out.println(mark);

            }
        }
        return new inner();
    }
    public class OBJ{
        public void getNumber(){
            System.out.println("number is 20");
        }
    }
    //静态内部类
    static class staticInner{
        static String name= "";
    }
}
