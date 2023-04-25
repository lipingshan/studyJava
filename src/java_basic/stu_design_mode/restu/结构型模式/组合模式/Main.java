package java_basic.stu_design_mode.restu.结构型模式.组合模式;

public class Main {
    public static void main(String[] args) {
        Worker w1= new Worker("小明","我来自中国");
        Worker w2 = new Worker("企鹅","我来自南极");
        Worker w3 = new Worker("熊猫","我来自四川");

        Department department = new Department("财务部","请到财务结账");
        department.add(w1);
        department.add(w2);
        department.add(w3);

        Company company = new Company("坑蒙拐骗公司","专门做慈悲的事");
        company.add(department);

        company.show();
    }
}
