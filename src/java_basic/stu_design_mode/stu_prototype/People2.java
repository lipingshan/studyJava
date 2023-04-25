package java_basic.stu_design_mode.stu_prototype;

import lombok.Data;
//深拷贝
import java.util.ArrayList;
import java.util.List;
@Data
public class People2 implements Cloneable{//虽然Cloneable 里面是空的也必须写
    private String name;
    private int age ;
    private List<String> hobby;
    public int getNumber(){
        return age+1000;
    }

    public People2(String name, int age, List<String> hobby) {
        System.out.println("调用People的构造方法");
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        People2 people2 = (People2)super.clone();
        List<String> list = this.getHobby();
        List<String> reList = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            reList.add(list.get(i));
        }
        people2.hobby=reList;
        return people2;
    }

    public String getMessage(){
        return "hello world";
    }

}
