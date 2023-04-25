package java_basic.stu_design_mode.restu.结构型模式.适配器模式.接口适配器;

public class Main {
    public static void main(String[] args) {
        AdapterInter adapterInter = () -> System.out.println("xyz");
        adapterInter.show();
    }
}
