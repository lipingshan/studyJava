package java_basic.java8new.cell_04;

import org.junit.Test;
//参考文档
// 三，类::实例方法
//https://blog.csdn.net/lkforce/article/details/99682885
public class Single02 {
    @Test
    public void method() {
        OneClass oneClass = new OneClass();
        oneClass.oneString = "abc";
        //此处OneClass::concatString 中的concatString为实例方法
        //这意味着：此处的参数是一个函数式接口，并且OneClass是该函数式接口泛型实参
        //并且该函数式接口唯一的
        String result = oneClass.startHandleString(OneClass::concatString, "123");
        System.out.println(result);

//相当于以下效果
        OneClass oneClass2 = new OneClass();
        oneClass2.oneString = "abc";
        ImTheOne theOne2 = (a, b,c) -> oneClass2.concatString(b,c);
        String result2 = theOne2.handleString(theOne2, "123","xyz");
        System.out.println(result2);

    }
}
@FunctionalInterface
 interface ImTheOne<T> {
    String handleString(T a, String b,String c);
}
class OneClass {
    String oneString;

    public String concatString(String a,String b) {
        return this.oneString + a+b;
    }

    public String startHandleString(ImTheOne<OneClass> imTheOne, String str) {
        String result = imTheOne.handleString(this, str,"xyz");
        return result;
    }
}
