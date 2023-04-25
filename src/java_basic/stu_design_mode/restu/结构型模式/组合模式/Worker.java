package java_basic.stu_design_mode.restu.结构型模式.组合模式;
//员工 为叶子 没有add remove
public class Worker extends ComponentAbst {
    Worker(String name,String describe){
        this.setName(name);
        this.setDescribe(describe);
    }
    @Override
    void show() {
        System.out.println("员工名字："+this.getName()+"\n"+
                "员工描述："+this.getDescribe());
    }
}
