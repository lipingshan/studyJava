package java_basic.stu_design_mode.restu.行为型模式.责任链模式;

public class CellA extends Chain{
    public CellA(String mark) {
        super(mark);
    }
    @Override
    public void operation(String msg) {

        if(msg!=null&&msg.equals(this.getMark())){
            System.out.println("CellA 开始处理msg");
            System.out.println("环节"+this.getMark()+" 正在处理问题。");
            System.out.println("CellA 处理msg完毕");
        }else{
            if(msg==null) return ;
            if(this.getNext()!=null){
                getNext().operation(msg);
            }
        }
    }
}
