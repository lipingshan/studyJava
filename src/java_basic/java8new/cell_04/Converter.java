package java_basic.java8new.cell_04;

@FunctionalInterface
public interface Converter<F,T> {
        T convert(F from);
}
