package java_basic.stu_design_mode.stu_Bulider;

import java.util.List;
//建造者接口
public interface Builder<T,R> {
     T setName(String name) ;

     T setAge(int age) ;

     T setScore(int score) ;

     T setCity(String city) ;

     T setHobby(List<String> hobby) ;

     R getPeople();
}
