package java_basic.stu_design_mode.restu.行为型模式.迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
    private List<Book> bookList ;

    public BookShelf() {
        this.bookList = new ArrayList<>();
    }
    // 向书架上增加书
    public void addBook(Book book){
        bookList.add(book);
    }
    // 从书架上查看书
    public Book getBook(int index){
        return bookList.get(index);
    }

    // 从书架上拿下书 list.move(int index)。list.move(Object o)情况比较复杂
    public Book removeBook(int index){
       return bookList.remove(index);
    }
    // 获取当前书的数量
    public int getSize(){
        return bookList.size();
    }
    @Override
    public Iterator getIterator() {
        return new BookShelfIterator(this);
    }
}
