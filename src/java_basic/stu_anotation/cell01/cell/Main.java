package java_basic.stu_anotation.cell01.cell;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class Main {
    @Test
    public void method() {
        {
            Annotation[] annotations = InheritedBaseImpl.class.getAnnotations();
            assertTrue("", Arrays.stream(annotations).anyMatch(l -> l.annotationType().equals(IsInheritedAnnotation.class)));
            assertTrue("", Arrays.stream(annotations).noneMatch(l -> l.annotationType().equals(NoInherritedAnnotation.class)));
        }
    }
}
