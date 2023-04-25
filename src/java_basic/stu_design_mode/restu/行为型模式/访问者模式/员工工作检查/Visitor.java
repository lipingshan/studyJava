package java_basic.stu_design_mode.restu.行为型模式.访问者模式.员工工作检查;
//观察者接口
public interface Visitor {
    //void visit(Staff staff);
    //如果由于各个员工可能有较大差异，或者需要不同员工对象参与的运算不一样，就不能这样写

    //对每个访问的对象分别处理
    void visit(Engineer engineer);
    void visit(Manager manager);
}
