package java_basic.stu_design_mode.stu_Flyweight;
/**
  * @Description //抽象享元角色
  * @Author lps
  * @Date 2020-08-22 13:02:19 星期六
  * @Version 1.0
  **/
public interface Flyweight {
    /**
     * @Author lps
     * @Description //引入外部数据的方法
     * @Date 2020-08-22 13:09:36 星期六
     * @Param [outer]
     * @return void
     **/
    public void operation(UnsharedConcreteFlyweight outer);

}
