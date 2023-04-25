package java_basic.java8new.cell_04;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data                              //get，set
@NoArgsConstructor                 //无参构造
//@AllArgsConstructor                //有参构造
class Person {
    String firstName;
    String lastName;

  //Person() {}

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    static String showMessage(String tell){
        //System.out.println(tell);
        return tell;
    }
    void showMessage_(String tell){
        System.out.println(tell);
    }


}
