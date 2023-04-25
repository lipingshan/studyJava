package java_basic.genericity.cell_02;

public interface Fruit<T> {
    T getData(T t);
    T setData(T t);
}
