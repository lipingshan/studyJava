package java_basic.stu_design_mode.restu.结构型模式.享元模式;
//具体享元
public class ConcreteFlyweight implements FlyWeight{
    private String key;
    public ConcreteFlyweight(String key) {
        this.key = key;
    }
    @Override
    public void operation(UnsharedConcreteFlyweight unsharedConcreteFlyweight) {
        System.out.println("当前享元 key="+key+"\n"+"外部状态为:"+unsharedConcreteFlyweight.getInfo());
    }
}
