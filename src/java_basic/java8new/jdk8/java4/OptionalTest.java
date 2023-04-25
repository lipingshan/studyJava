package java_basic.java8new.jdk8.java4;

import org.junit.Test;

import java.util.Optional;

public class OptionalTest {

    @Test
    public void test1(){

        Girl girl = new Girl();
        //girl = null;
        Optional<Girl> optionalGirl = Optional.of(girl);

    }

    @Test
    public void test2(){

        Girl girl = new Girl("张三");
//        girl = null;
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);

    }

    public String getGirlName(Boy boy){
        return boy.getGirl().getName();
    }
    @Test
    public void test3(){
        Boy boy = new Boy();
        String girlName = this.getGirlName(boy);
        System.out.println(girlName);
    }

    @Test
    public void test4(){
        Girl girl = new Girl("调用时参数");
        girl=null;
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        System.out.println(optionalGirl);
        Girl hah = optionalGirl.orElse(new Girl("默认参数"));
        System.out.println(hah);

    }

    @Test
    public void test(){
        Boy boy = new Boy();
        boy = null;
        boy = new Boy(new Girl("调用参数不为空"));
        String girlFriendName = this.getGirlFriendName(boy);
        System.out.println(girlFriendName);
    }

    public String getGirlFriendName(Boy boy){
        Optional<Boy> optionalBoy = Optional.ofNullable(boy);
        Boy boy1 = optionalBoy.orElse(new Boy(new Girl("哈哈")));
        Girl girl = boy1.getGirl();
        Optional<Girl> optionalGirl = Optional.ofNullable(girl);
        Girl girl1 = optionalGirl.orElse(new Girl("嘻嘻"));
        return girl1.getName();
    }

}
