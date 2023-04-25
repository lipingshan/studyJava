package java_basic.stu_design_mode.restu.创建型模式.单例模式;

public enum  SingletonEH_enum {
    people;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
