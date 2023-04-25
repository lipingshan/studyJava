package java_basic.stu_anotation.cell01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.PARAMETER,ElementType.METHOD})//作用在方法或者参数上
@Retention(RetentionPolicy.RUNTIME)
public @interface ParameterAnnotation {
    String name();
}
