package java_basic.stu_design_mode.restu.行为型模式.解释器模式.jep;

import org.nfunk.jep.JEP;
// 试用版 有限制 为50 个解析。因此 不考虑使用。
//http://www.singularsys.com/jep/
public class StuJEP {
    public static void main(String[] args) {
        JEP jep = new JEP();

        //给变量赋值
        String exp = "((a+b)*(c+b))/(c+a)/b";
        jep.addVariable("a", 16);
        jep.addVariable("b", 5);
        jep.addVariable("c", 66);

        try { //执行
            jep.parseExpression(exp);
            Object result = jep.getValue();
            System.out.println("计算结果： " + result);
        } catch (Exception e) {
            System.out.println("An error occured: " + e.getMessage());
        }

    }
}
