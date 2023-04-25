package java_basic.stu_design_mode.restu.行为型模式.迭代器模式.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Tes1 {
    public static void main(String[] args) {
        String a="my,name,is.kangkang ,.how are you ?";
        String[] res =a.split("[,.]+");//默认贪婪匹配
        System.out.println("数组：");
        for(String s:res){
            System.out.print(s+" || ");
        }

        System.out.println("\nlist集合：");
        List<String> list = new ArrayList<>(Arrays.asList(res));
        for (String lis:list){
            System.out.print(lis+" || ");
        }
        System.out.println("\n检验内存区域：");
        res[0]="xyz";
        for(String s:list){
            System.out.print(s+" || "); // 不公内存区域
        }
    }

    @Test
    public void method() {
        String a="my,name,is.kangkang ,.how are you ?";
        String[] res =a.split("[,.]+");//默认贪婪匹配
        List<String> list = Arrays.asList(res);// 不能这样直接使用，会和数组共内存区域
        for(String s:list){
            System.out.print(s+" || ");
        }
        res[0]="xyz";
        System.out.println();
        for(String s:list){
            System.out.print(s+" || ");
        }
    }
    @Test
    public void method1() {
        String a="my,name,is.kangkang ,.how are you ?";
        String[] res =a.split("[,.]+");//默认贪婪匹配
        List<String> resultList = new ArrayList<>(res.length);
        Collections.addAll(resultList,res);
        res[0]="xyz";
        for(String ls:resultList){
            System.out.print(ls+" || ");
        }
    }
}
