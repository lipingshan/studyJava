package java_basic.stu_design_mode.restu.行为型模式.访问者模式.员工工作检查;

import java.util.ArrayList;
import java.util.List;

//业务报告
public class BusinessReport {
    List<Staff> staffs = new ArrayList<Staff>();
    BusinessReport(){
        staffs.add(new Engineer("工程师A"));
        staffs.add(new Engineer("工程师B"));
        staffs.add(new Engineer("工程师C"));
        staffs.add(new Manager("经理A"));
        staffs.add(new Manager("经理B"));
    }
    public void showReport(Visitor visitor){
        for(Staff staff: staffs){
            staff.accept(visitor);
        }
    }
}
