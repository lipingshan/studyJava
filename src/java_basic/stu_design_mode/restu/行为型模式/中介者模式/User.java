package java_basic.stu_design_mode.restu.行为型模式.中介者模式;

public class User {
    private String name;
    private String message;

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User(String name) {
        this.name = name;

    }
    public void say(){
        ChatRoom.communicate(this,message);
    }
}
