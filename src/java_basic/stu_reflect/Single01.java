package java_basic.stu_reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalTime;
import java.util.Date;
import java.util.Locale;

//参考文档
//https://blog.csdn.net/ju_362204801/article/details/90578678
public class Single01 {
    @Test
//step1.获取类的类对象的3种方法
    public void method01() throws Exception {
        //获取对象的几种方法
        //1.new 2.反序列化，3，反射
       //step1.获取类的类对象的3种方法
        Class<?> clazz = Class.forName("java_basic.stu_reflect.Person");
        Class<?> clazz1 = Person.class;
        Class<?> clazz2 = new Person().getClass();

    }

    @Test
//step2.获取构造函数
    public void method02() throws Exception {
        Class<?> clazz = Class.forName("java_basic.stu_reflect.Person");

        //无参构造
        //Constructor c = clazz.getConstructor(null);
        //Person p = (Person)c.newInstance(null);
        //p.setName("hello");
        //System.out.println(p.getName());
        //一个参数的构造器
        Constructor c1 =clazz.getConstructor(String.class);
        Person p1 = (Person)c1.newInstance("小明");
        System.out.println( p1.getName());
        //多个参数构造函数
        Constructor c2 = Person.class.getConstructor(String.class,int.class);
        Person p2 = (Person)c2.newInstance("张三丰",140);
        System.out.println(p2.getName());
        //私有构造函数
        Constructor c3 = new Person().getClass().getDeclaredConstructor(int.class);
                    c3.setAccessible(true);
        Person p3 = (Person)c3.newInstance(88);

        System.out.println(p3.getAge());

    }

    @Test
//step3调用方法
    public void method03() throws Exception {

        Class<?> clazz = Person.class;
        Person p = (Person)clazz.newInstance();//会执行默认的无参构造
        //1.执行public void m1()
        //Method md = clazz.getMethod("m1",null);
        //md.invoke(p);//md.invoke(new Person("",23),null);
        //2.执行 public void m2(String name)
        // Method m = clazz.getMethod("m2",String.class);
        //m.invoke(p,"kang康");
        //3.执行  public String m3(String name,int age)
        //  Method m = clazz.getMethod("m3",String.class,int.class);
         //System.out.println(m.invoke(p,"王重阳",109));
        //4.执行 private void m4(Date d)
        Method m = clazz.getDeclaredMethod("m4",Date.class);//new Class[]{Date.class}
        m.setAccessible(true);
        m.invoke(p,new Date());// m.invoke(p,new Object[]{new Date()});

    }
    @Test
    //数组特殊处理 参数为数组
    public void method04() throws Exception {
      Class<?>  clazz = Person.class;
      Person p = (Person)clazz.newInstance();
      //5执行 public static void m6(String[] strs)
      Method m = clazz.getMethod("m6",String[].class);
      m.invoke(p,(Object)new String[]{"tom","jerry","spike"});
      //m.invoke(p,new Object[]{new String[]{"tom","jerry","spike"}});
    }
    @Test
    //调用静态方法
    //调用静态方法，无需对象，调用时invoke()的第一个参数为null
    public void method05() throws Exception {
      //5.执行 public static void m5(String param)
        Class<?> clazz = Person.class;
        Method m = clazz.getMethod("m5",String.class);
        m.invoke(null,"山高月小");
    }
//step4.反射类中的属性字段
    @Test
    public void method06()throws Exception {
        //private String name;
        //private int age;
        //private static LocalTime time= LocalTime.now(); 静态属性
        Class<?> clazz = Person.class;
        Person p = (Person) clazz.newInstance();
        Field f = clazz.getDeclaredField("name");
        f.setAccessible(true);
        p.setName("杜甫");
        System.out.println(f.get(p));
        f.set(p,"李白");
        System.out.println(f.get(p));

        Field f1 = clazz.getDeclaredField("time");
        f1.setAccessible(true);
        f1.set(null, LocalTime.now());
        System.out.println(f1.get(null));//如果该属性是公有的话，直接类名点


    }
}
