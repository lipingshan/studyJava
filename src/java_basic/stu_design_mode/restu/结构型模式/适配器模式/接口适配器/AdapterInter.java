package java_basic.stu_design_mode.restu.结构型模式.适配器模式.接口适配器;

public interface AdapterInter extends AdapteeInterface{
    default void eat(){};
    default String drink(){return null;};
    void show();
}
