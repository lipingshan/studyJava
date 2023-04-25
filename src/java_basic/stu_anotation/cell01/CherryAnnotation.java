package java_basic.stu_anotation.cell01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//该注解定义在方法上
@Retention(RetentionPolicy.RUNTIME)
public @interface CherryAnnotation {
    String name();
    int age() default 13;
    int[] score();
}
