package java_basic.stu_design_mode.restu.行为型模式.解释器模式.stutest;

public class ToStringTes {
    private String name;

    public ToStringTes(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ToStringTes{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new ToStringTes("中国"));
    }
}
