package java_basic.stu_design_mode.restu.行为型模式.访问者模式.员工工作检查;

// CEO 查看所有员工的name、kpi。
// 如果 访问经理的话还会查看他的产品数量
public class CeoVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师："+engineer.name+"  kpi:"+engineer.kpi);
    }
    @Override
    public void visit(Manager manager) {
        System.out.println("经理："+manager.name+"  kpi:"+manager.kpi+"  产品数："+manager.getProducts());
    }
}
