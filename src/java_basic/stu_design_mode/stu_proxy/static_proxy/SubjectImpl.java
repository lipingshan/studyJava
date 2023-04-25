package java_basic.stu_design_mode.stu_proxy.static_proxy;

import com.alibaba.fastjson.JSON;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SubjectImpl implements Subject {
    private String name;
    private String[] hobby;

    public SubjectImpl() {
    }

    @Override
    public String say(String msg) {
        System.out.println("my name is "+name);
        return msg;
    }

    @Override
    public int calculate(int a, int b) {
        System.out.println("my hobby is "+ JSON.toJSON(hobby).toString());
        return a+b;
    }
}
