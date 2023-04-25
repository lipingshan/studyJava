package java_basic.stu_design_mode.restu.创建型模式.原型模式.浅拷贝;

import java.util.ArrayList;
import java.util.List;

public class EasyCopyExample implements Cloneable {
    private List<String> nameList = new ArrayList<>();

    @Override
    protected EasyCopyExample clone() throws CloneNotSupportedException {
        return (EasyCopyExample) super.clone();
    }

    public void addName(String name) {
        nameList.add(name);
    }

    public void printNames() {
        for (String name : nameList) {
            System.out.println(name);
        }
    }
}