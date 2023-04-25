package java_basic.stu_design_mode.stu_singleton;

//俄汉模式  通过枚举来创建单例(默认多线程安全) 枚举单例相对于静态枚举单例同样是没有达到懒加载。
public enum  Singleton03 {
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
