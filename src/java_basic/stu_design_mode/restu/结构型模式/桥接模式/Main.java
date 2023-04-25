package java_basic.stu_design_mode.restu.结构型模式.桥接模式;

public class Main {
    public static void main(String[] args) {
        Vivo vivo = new Vivo("vivo的附加参数");
        FolderPhone folderPhone = new FolderPhone(vivo);
        folderPhone.call("折叠功能");//
    }
}



