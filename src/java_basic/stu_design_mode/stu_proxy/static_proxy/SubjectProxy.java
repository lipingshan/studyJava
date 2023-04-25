package java_basic.stu_design_mode.stu_proxy.static_proxy;

public class SubjectProxy extends SubjectImpl {
    Subject subject;
    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }
    @Override
    public String say(String msg) {
        System.out.println("say before");
        //super.say("");
        String res = subject.say(msg);
        System.out.println("say after");
        return res;

    }

    @Override
    public int calculate(int a, int b) {
        System.out.println("calculate before");
        int res = subject.calculate(a,b);
        System.out.println("calculate after");
        return res;
    }
}
