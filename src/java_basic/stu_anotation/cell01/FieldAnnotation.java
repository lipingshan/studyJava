package java_basic.stu_anotation.cell01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//适用范围为字段
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldAnnotation {
    String description();
    int length();
}
