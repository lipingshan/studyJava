package java_basic.stu_design_mode.restu.结构型模式.桥接模式;

public class HuaWei implements Brand{
    private String xzparam;//修正参数
    HuaWei(String xzparam){
        this.xzparam=xzparam;
    }
    @Override
    public void call(String style) {
        System.out.println("用华为手机打电话。\n"+
                "修正参数为："+xzparam+"\n"+
                "手机型号为："+style);
    }
}
