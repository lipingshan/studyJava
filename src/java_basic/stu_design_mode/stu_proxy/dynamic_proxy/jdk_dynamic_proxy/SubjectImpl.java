package java_basic.stu_design_mode.stu_proxy.dynamic_proxy.jdk_dynamic_proxy;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//委托类 要求委托类必须有接口，可以有多个
public class SubjectImpl implements Subject {
    private String name;
    @Override
    public String showMessage(String msg) {
        System.out.println("执行showMessage方法");
        return msg;
    }

    @Override
    public int getScore(int a, int b) {
        System.out.println("执行getScore方法");
        return a+b;
    }

    public void otherMethod(){
        System.out.println("执行otherMethod");
    }


}
