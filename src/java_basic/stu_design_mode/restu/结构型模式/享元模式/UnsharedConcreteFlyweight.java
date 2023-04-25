package java_basic.stu_design_mode.restu.结构型模式.享元模式;
//非享元 是不可以共享的外部状态
public class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
