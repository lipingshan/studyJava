package java_basic.stu_design_mode.restu.行为型模式.观察者模式.demo;

import lombok.Data;

import java.util.Objects;

@Data
public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // list 中移除对象会触发该对象的 equals 方法
    @Override
    public boolean equals(Object o) {
        System.out.println("触发equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return age == people.age &&
                name.equals(people.name);
    }

    @Override
    public int hashCode() {
        System.out.println("触发hashCode");
        return Objects.hash(name, age);
    }
}
