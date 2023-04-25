package java_basic.stu_design_mode.restu.创建型模式.原型模式.浅拷贝;

public class Client {
    public static void main(String[] args) {
        try {
            //创建一个原始对象并添加一个名字
            EasyCopyExample originalObject = new EasyCopyExample();
            originalObject.addName("test1");

            //克隆一个新对象并添加一个名字
            EasyCopyExample cloneObject = originalObject.clone();
            cloneObject.addName("test2");

            //打印原始对象和新对象的name
            originalObject.printNames();
            System.out.println();
            cloneObject.printNames();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}