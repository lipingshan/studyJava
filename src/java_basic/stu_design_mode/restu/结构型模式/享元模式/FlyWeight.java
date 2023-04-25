package java_basic.stu_design_mode.restu.结构型模式.享元模式;
//享元接口，提供具体享元的公共方法规范，外部享元状态以参数的形式通过方法传入
public interface FlyWeight {
    void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight);
}
