package java_basic.stu_design_mode.restu.创建型模式.单例模式;

public class SingletonPattern {
    public static void main(String[] args) {
        // 饿汉模式
//        SingletonEH singletonEH = SingletonEH.getInstance();
//        singletonEH.setName("小敏");
//        singletonEH.setAge(22);
//        System.out.println(SingletonEH.getInstance().getName());
        // 枚举类性的饿汉模式
//        SingletonEH_enum singletonEH_enum =SingletonEH_enum.people;
//        singletonEH_enum.setName("晓东");
//        singletonEH_enum.setAge(34);
//        System.out.println(singletonEH_enum.getName());
//        singletonEH_enum =SingletonEH_enum.people;
//        System.out.println(singletonEH_enum.getName());

        //懒汉模式 双重检验
//        SingletonLazyDoubleCheck singletonLazyDoubleCheck = SingletonLazyDoubleCheck.getInstance();
//        singletonLazyDoubleCheck.setName("张三");
//        singletonLazyDoubleCheck.setAge(23);
//        System.out.println(singletonLazyDoubleCheck.getName());
//        System.out.println(SingletonLazyDoubleCheck.getInstance().getName());
        //懒汉模式 内部类
        SingletonLazyInnerclass singletonLazyInnerclass = SingletonLazyInnerclass.getInstance();
        singletonLazyInnerclass.setName("李白");
        singletonLazyInnerclass.setAge(23);
        System.out.println(SingletonLazyInnerclass.getInstance().getName());

    }
}
