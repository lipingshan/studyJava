package java_basic.stu_design_mode.restu.行为型模式.备忘录模式.example2;




public class MementoPattren1 {
    public static void main(String[] args) {
        //发起者
        Originator originator = new Originator("状态1");
        System.out.println(originator.getState());

        //备忘录管理者 备份
        CareTaker careTaker = new CareTaker();
        careTaker.addMemento(originator.createMemento());

        //更改状态  备份
        originator.setState("状态2");
        System.out.println(originator.getState());
        careTaker.addMemento(originator.createMemento());

        // 回滚
        originator.rollbackFromMemento(careTaker.get(0));
        System.out.println("回滚到："+originator.getState());

        originator.rollbackFromMemento(careTaker.get(1));
        System.out.println("回滚到："+originator.getState());

    }
}
