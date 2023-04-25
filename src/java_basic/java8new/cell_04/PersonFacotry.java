package java_basic.java8new.cell_04;

interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
interface Other<T>{
    String  apply(T t);
}
interface Obj<T>{
    T getData();
        }
