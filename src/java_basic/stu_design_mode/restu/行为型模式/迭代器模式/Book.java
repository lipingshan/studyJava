package java_basic.stu_design_mode.restu.行为型模式.迭代器模式;

import java.util.Objects;

//元素
public class Book {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("book 触发equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        System.out.println("xxxxx");
        return Objects.hash(name);
    }
}
