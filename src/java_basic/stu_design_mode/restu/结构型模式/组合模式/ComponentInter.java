package java_basic.stu_design_mode.restu.结构型模式.组合模式;

public interface ComponentInter {
    default void add(ComponentAbst component){};
    default void remove(ComponentAbst component){};
}
