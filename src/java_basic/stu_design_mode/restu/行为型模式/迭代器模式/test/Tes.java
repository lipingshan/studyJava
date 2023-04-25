package java_basic.stu_design_mode.restu.行为型模式.迭代器模式.test;

import java_basic.stu_design_mode.restu.行为型模式.迭代器模式.Book;

import java.util.ArrayList;
import java.util.List;

public class Tes {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<Book>();
        list.add(new Book("a"));
        list.add(new Book("b"));
        list.add(new Book("d"));
        list.add(new Book("c"));
        list.add(new Book("c"));

        for(Book book:list){
            System.out.println(book.getName()+"  ");
        }
        System.out.println("++++++++++++++++++++++++");
        //list.remove(3);// 不会触发equals
        //list.remove("c");// 不会触发equals
        list.remove(new Book("c")); // 会触发equals 只会删除1个而不是所有
        for(Book book:list){
            System.out.println(book.getName()+"  ");
        }

    }
}
