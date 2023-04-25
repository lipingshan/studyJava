package java_basic.stu_design_mode.stu_Facade;

public class Facade {
    SubSystem1 subSystem1 = new SubSystem1();
    SubSystem2 subSystem2 = new SubSystem2();
    SubSystem3 subSystem3 = new SubSystem3();

    public void handle(){//所有子系统的访问，被集中在一起
        subSystem1.showMessage();
        subSystem2.handleMessage();
        subSystem3.doMessage();
    }

}
