package java_basic.java8new.jdk8.java5;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTest {

    /**
     * 日期操作
     */
    @Test
    public void test1(){

        //1.创建指定日期
        LocalDate date1 = LocalDate.of(2021, 5, 11);
        System.out.println("date1==>"+date1);

        //2.得到当前日期
        LocalDate nowdate = LocalDate.now();
        System.out.println("nowdate==>"+nowdate);

        //3.根据LocalDate对象获取应的日期信息
        System.out.println("年==>"+nowdate.getYear());
        System.out.println("月==>"+nowdate.getMonth().getValue());
        System.out.println("日==>"+nowdate.getDayOfMonth());
        System.out.println("星期==>"+nowdate.getDayOfWeek().getValue());


    }

    /**
     * 时间操作
     */
    @Test
    public void test2(){

        //1.创建指定时间
        LocalTime time1 = LocalTime.of(22,1,1,100);
        System.out.println("time1==>"+time1);

        //2.创建当前时间
        LocalTime nowtime = LocalTime.now();
        System.out.println("nowtime==>"+nowtime);

        //3.根据LocalTime对象获取应的日期信息
        System.out.println("时==>"+nowtime.getHour());
        System.out.println("分==>"+nowtime.getMinute());
        System.out.println("秒==>"+nowtime.getSecond());
        System.out.println("毫秒==>"+nowtime.getNano());

    }

    /**
     * 日期时间操作
     */
    @Test
    public void test3(){

        LocalDateTime localDateTime = LocalDateTime.of(2021,10,11,22,22,22);
        System.out.println(localDateTime);

        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println(DateTime);

        System.out.println(DateTime.getYear());
        //下面的同上
    }

}
