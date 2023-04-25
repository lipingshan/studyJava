package java_basic.java8new.cell_03;

import org.junit.Test;

import java.util.function.Function;
//参考文档
//https://www.cnblogs.com/rever/p/9725173.html
public class FunctionStu02 {
    @Test
    public void method(){
       int rs1 = calculate(integer ->integer+integer,2);//2+2
       int rs2 = calculate(integer ->integer*integer,2);
       int rs3 = calculate(integer ->integer/integer,2);
        System.out.println("rs1="+rs1+" rs2="+rs2+" rs3="+rs3);
    }

    //1.可以写一个方法calculate（函数式接口的实现(对象)，和一个个输入参数){...}来进行简单的运算
    public Integer calculate(Function<Integer,Integer> cal,Integer input){
        return cal.apply(input);
    }
    //2.嵌套(繁琐的方法，在3中有改进)
    @Test
    public void method01(){
        //两个操作先执行A，在执行B
        Function<Integer,Integer> A = input ->input*2;
        Function<Integer,Integer> B = integer -> integer+9;
        System.out.println(B.apply(A.apply(2)));//13

        //同样两个操作，先执行B，再执行A
        System.out.println(A.apply(B.apply(2)));//22
        //AA
        System.out.println(A.apply(A.apply(2)));//8
        //BB
        System.out.println(B.apply(B.apply(2)));//20
    }
    //3.compose和andThen组织方式相饭
    //compose 从后向前，andThen从前向后
    @Test
    public void method3(){
        Function<Integer,Integer> A=i->i+1;
        Function<Integer,Integer> B=i->i*i;
        //AB
        System.out.println("F1:"+B.apply(A.apply(5)));//36
        System.out.println("F1:"+B.compose(A).apply(5));//36

        //BA
        System.out.println("F2:"+A.apply(B.apply(5)));//26
        System.out.println("F2:"+B.andThen(A).apply(5));//26

        //ABBA 2+1=3|3*3=9|9*9=81|81+1=82
        System.out.println(A.andThen(B).andThen(B).andThen(A).apply(2));//82
        //ABAA 2+1=3|3*3=9|9+1=10|10+1=11
        System.out.println(A.compose(A).compose(B).compose(A).apply(2));//11
    }

}
