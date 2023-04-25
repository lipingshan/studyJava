package javaTool.cell002;

import lombok.Data;

@Data
public class People {
    private String name;
    private Integer age;

    public People(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
