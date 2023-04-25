package java_basic.stu_design_mode.restu.行为型模式.中介者模式;

public class ChatRoom {
    public static void communicate(User user,String msg){
        System.out.println(user.getName()+"说："+msg);
    }
}
