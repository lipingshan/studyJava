package java_basic.stu_design_mode.restu.创建型模式.原型模式.深拷贝;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DeepCopyExample implements Serializable {
    private List<String> nameList = new ArrayList<>();
    private String name = "张三";
    private int age = 23;

    public DeepCopyExample deepClone() throws IOException, ClassNotFoundException {
        //将对象写到流里
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);
        //从流里读回来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (DeepCopyExample) ois.readObject();
    }

    public void addName(String name) {
        nameList.add(name);
    }

    public void printNames() {
        for (String name : nameList) {
            System.out.println(name);
        }
        System.out.println(name);
        System.out.println(age);
    }
}