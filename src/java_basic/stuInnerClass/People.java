package java_basic.stuInnerClass;

import org.junit.Test;
//1.成员内部类地位和类的成员等同
//2.成员内部类可以访问外部类的任意成员方法。
//3.如果外部类需要访问内部类，则需要先创建内部类对象。直接创建。
//4.其他类获取成员内部类对象为 new People().new Man();
//5.成员内部类的访问修饰符可以控制他的访问权限。这一点和类的成员是一致的。
public class People {
    private  String name="小明";
    public int age=29;
    @Test
    public void method01() {
        System.out.println( new Man().showMessage());
        System.out.println(new People().age);//29
        System.out.println(People.this.age);//29
    }
    public People(){
    }

    //成员内部类
   public class Man{
        //如果在了成员内部类前面加一个private则无法在其他外部类中通过
        //new People().new Man()的方式创建 Man的对象。
        public int age =28;
        public String showMessage(){
            return "hello world"+"  name="+name;
        }
        public int getAge(){
            return age;
        }
    }
}

