package java_basic.stu_design_mode.restu.行为型模式.迭代器模式;

public class IteratorPattern {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook(new Book("水浒传"));
        bookShelf.addBook(new Book("三国演义"));
        bookShelf.addBook(new Book("西游记"));
        bookShelf.addBook(new Book("金梅瓶"));
        Iterator<Book> iterator = bookShelf.getIterator();
        while(iterator.hasNext()){
            System.out.println("current book name is :"+iterator.next().getName());
        }

    }
}
