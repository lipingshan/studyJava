package java_basic.stu_serializable;

import lombok.Data;

import java.io.Serializable;
@Data
public class Person implements Serializable {
    private static final long serialVersionUID = 3604972003323896788L;
    private transient int age;
    private String name;
    private String sex;
    private String other;
}
