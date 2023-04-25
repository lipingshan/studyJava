package java_basic.stu_design_mode.restu.行为型模式.访问者模式.员工工作检查;

public class VisitorPattern {
    public static void main(String[] args) {
        Visitor ceo = new CeoVisitor();
        Visitor cto = new CtoVisitor();
        BusinessReport businessReport = new BusinessReport();
        System.out.println("######ceo查看######");
        businessReport.showReport(ceo);
        System.out.println("\n######cto查看######");
        businessReport.showReport(cto);

    }
}
