package java_basic.stu_design_mode.stu_proxy.dynamic_proxy.cglib_dynamic_proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subject {
    private String name;
    public String showMessage(String msg){
        return msg;
    }
    public int calculate(int a,int b){
        return  a*b;
    }
}
