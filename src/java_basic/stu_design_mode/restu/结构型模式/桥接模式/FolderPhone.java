package java_basic.stu_design_mode.restu.结构型模式.桥接模式;

public class FolderPhone extends Phone{

    FolderPhone(Brand brand) {
        super(brand);

    }
    void call(String style){
        System.out.println("用折叠手机");
        super.call(style);
    }
}
