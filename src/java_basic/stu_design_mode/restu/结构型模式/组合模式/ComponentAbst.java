package java_basic.stu_design_mode.restu.结构型模式.组合模式;

public abstract class ComponentAbst implements ComponentInter {
    private String name;
    private String describe;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getName() {
        return name;
    }

    public String getDescribe() {
        return describe;
    }

    abstract void  show();//所有子类必须实现

}
