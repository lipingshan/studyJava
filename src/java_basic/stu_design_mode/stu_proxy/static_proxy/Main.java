package java_basic.stu_design_mode.stu_proxy.static_proxy;

import org.junit.Test;

public class Main {
    @Test
    public void method() {
        Subject sb = new SubjectImpl("小明",new String[]{"book","eat","fishing"});
       Subject sbpy = new SubjectProxy(sb);
       sbpy.calculate(1,6);
       sb.calculate(1,6);
    }
}
