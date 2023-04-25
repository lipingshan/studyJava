package java_basic.stu_design_mode.stu_singleton;

import org.junit.Test;

public class Main {
    @Test
    public void method01() {
        Singleton01 sgt1 = Singleton01.getInstance();
        Singleton01 sgt2 = Singleton01.getInstance();
        System.out.println("sgt1==sgt2  " + (sgt1 == sgt2));
        sgt1.setName("小军");
        System.out.println(sgt2.getName());

    }
    @Test
    public void method02() {
        Singleton02 sgt1 = Singleton02.getInstance();
        Singleton02 sgt2 = Singleton02.getInstance();
        System.out.println("sgt1==sgt2  " + (sgt1 == sgt2));
        sgt1.setName("小军");
        System.out.println(sgt2.getName());

    }
    @Test
    public void method03() {
        Singleton03 sgt1 = Singleton03.people;
        sgt1.setName("小军");
        Singleton03 sgt2 = Singleton03.people;
        System.out.println(sgt2.getName());
    }
    @Test
    public  void method04() {

        Singleton04 sgt1 = Singleton04.getInstance();
        Singleton04 sgt2 = Singleton04.getInstance();
        System.out.println("sgt1==sgt2  " + (sgt1 == sgt2));
        sgt1.setName("小军");
        System.out.println(sgt2.getName());
    }
}
