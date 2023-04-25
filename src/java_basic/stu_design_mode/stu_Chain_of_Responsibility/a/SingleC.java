package java_basic.stu_design_mode.stu_Chain_of_Responsibility.a;

public class SingleC extends Single {
    @Override
    public void Operation(String key) {
        if(key!=null&&key.equals("C")){
            System.out.println("SingleC 正在着手处理");
        }else{
            if(key==null){
                System.out.println("参数有误，key=null");
                return;
            }
           if(getNext()!=null){
               getNext().Operation(key);
           }else{
               System.out.println("针对当前key并没有可用的对象");
           }

        }
    }
}
