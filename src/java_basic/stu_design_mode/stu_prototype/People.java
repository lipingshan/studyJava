package java_basic.stu_design_mode.stu_prototype;

import lombok.Data;
//浅拷贝
import java.util.List;
@Data
public class People implements Cloneable{//虽然Cloneable 里面是空的也必须写
    private String name;
    private int age ;
    private List<String> hobby;
    public int getNumber(){
        return age+1000;
    }

    public People(String name, int age, List<String> hobby) {
        System.out.println("调用People的构造方法");
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getMessage(){
        return "hello world";
    }

}
