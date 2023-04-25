package java_basic.stu_anotation.cell01;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;


public class Single01 {
    @Test
    //获取方法注解上的数据
    public void method01() throws Exception {
        Class<?> clazz = Student.class;
        Method m = clazz.getMethod("study",String.class);
        //查看该方法上是否有目标注解CherryAnnotation
        if(m.isAnnotationPresent(CherryAnnotation.class)){//存在该注解，则获取该注解
            CherryAnnotation ca = m.getAnnotation(CherryAnnotation.class);
            System.out.println(
                    "name===>"+ca.name()+
                    "  age==>"+ca.age()+
                     "  score==>"+ JSON.toJSON(ca.score()).toString()
                         );

        }else{
            System.out.println("没有该方法注解");
        }
    }

    @Test
    //获取类,接口,emum上的注解
    public void method02() {
        Class<?> clazz =  Student.class;
        if(clazz.isAnnotationPresent(ClassAnnotation.class)){
            ClassAnnotation ca = clazz.getAnnotation(ClassAnnotation.class);
            System.out.println("hobby===>"+JSON.toJSON(ca.hobby()).toString());
            System.out.println("name===>"+ca.name());
            System.out.println("num===>"+ca.num());
        }else{
            System.out.println("没有该类注解");
        }
    }

    @Test
    //获取字段上的注解
    public void method03() throws NoSuchFieldException {
        Class clazz = Student.class;
        Field[] fd =clazz.getDeclaredFields();
        FieldAnnotation fa;
        for(Field p :fd){
            if(p.isAnnotationPresent(FieldAnnotation.class)){
                fa = p.getAnnotation(FieldAnnotation.class);
                System.out.println(fa.description()+"-->"+fa.length());
            }
        }
    }

    @Test
    public void method04() throws NoSuchMethodException {
        Class<?> clazz = Student.class;
        Method m = clazz.getDeclaredMethod("study", String.class);
        ParameterAnnotation pa = m.getDeclaredAnnotation(ParameterAnnotation.class);
        System.out.println("pa.name()==>"+pa.name());

//       Annotation obj = m.getParameterAnnotations()[0][0];
//        System.out.println(obj.annotationType());
//        System.out.println(obj.toString());
       Parameter[] pt =m.getParameters();
       for(Parameter p :pt){
           System.out.println(p.getType());
           ParameterAnnotation pat =   p.getAnnotation(ParameterAnnotation.class);
           System.out.println("pat==>"+pat.name());
       }


    }
}
