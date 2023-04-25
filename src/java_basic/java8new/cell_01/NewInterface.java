package java_basic.java8new.cell_01;
@FunctionalInterface/*函数式接口,确保该接口只有一个抽象方法，便于写lambda表达式*/
public interface NewInterface {
    String  name="xiao明";

    String showMessage();
    default String showName() {
        return name;
    }
}
