package java_basic.stu_design_mode.restu.行为型模式.命令模式;
// 真正处理请求的类
public class Stock {
    void buy(){
        System.out.println("处理卖东西的指令。");
    }
    void sell(){
        System.out.println("处理买东西的指令。");
    }
}
