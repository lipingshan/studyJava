package java_basic.stu_design_mode.restu.结构型模式.组合模式;

import java.util.ArrayList;
import java.util.List;
// 公司
public class Company extends ComponentAbst{
    Company(String name,String describe){
        this.setName(name);
        this.setDescribe(describe);
    }
    private List<ComponentAbst> companys = new ArrayList<ComponentAbst>();
    @Override
    void show() {
        System.out.println("公司名字："+this.getName()+"\n"+
                "公司描述："+this.getDescribe());
        for(ComponentAbst company:companys){
            company.show();
        }
    }

    @Override
    public void add(ComponentAbst component) {
        companys.add(component);
    }

    @Override
    public void remove(ComponentAbst component) {
        companys.remove(component);
    }
}
