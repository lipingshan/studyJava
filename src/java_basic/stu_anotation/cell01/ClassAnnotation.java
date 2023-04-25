package java_basic.stu_anotation.cell01;

import java.lang.annotation.*;

@Target(ElementType.TYPE)//该注解用于描述类、接口或enum类型
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ClassAnnotation {
    String name();
    int num();
    String[] hobby();
}
