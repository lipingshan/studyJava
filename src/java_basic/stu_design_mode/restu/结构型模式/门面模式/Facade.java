package java_basic.stu_design_mode.restu.结构型模式.门面模式;

public class Facade {
    SubSystem01 subSystem01 = new SubSystem01();
    SubSystem02 subSystem02 = new SubSystem02();
    SubSystem03 subSystem03 = new SubSystem03();
    public void method(){
        subSystem01.method();
        subSystem02.method();
        subSystem03.method();
    }
}
