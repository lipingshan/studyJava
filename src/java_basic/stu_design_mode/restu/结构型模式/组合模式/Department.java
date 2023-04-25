package java_basic.stu_design_mode.restu.结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;
//部门
public class Department extends ComponentAbst{
    Department(String name,String describe){
        this.setName(name);
        this.setDescribe(describe);
    }
    List<ComponentAbst> departments = new ArrayList<ComponentAbst>();
    @Override
    void show() {
        System.out.println("部门名字："+this.getName()+"\n"+
                "部门描述："+this.getDescribe());
        for(ComponentAbst department:departments){
            department.show();
        }
    }

    @Override
    public void add(ComponentAbst component) {
        departments.add(component);
    }

    @Override
    public void remove(ComponentAbst component) {
        departments.remove(component);
    }
}
