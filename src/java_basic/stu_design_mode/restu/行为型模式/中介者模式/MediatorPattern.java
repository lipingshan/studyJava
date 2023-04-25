package java_basic.stu_design_mode.restu.行为型模式.中介者模式;

public class MediatorPattern {
    public static void main(String[] args) {
        User user1 = new User("晓东");
        user1.setMessage("沧海一声笑？");

        User user2 = new User("小明");
        user2.setMessage("滔滔两岸潮！");

        user1.say();
        user2.say();
   
    }
}
