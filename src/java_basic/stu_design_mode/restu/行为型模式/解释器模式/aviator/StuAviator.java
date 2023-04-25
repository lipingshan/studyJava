package java_basic.stu_design_mode.restu.行为型模式.解释器模式.aviator;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.Expression;
import com.googlecode.aviator.Options;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorBigInt;
import com.googlecode.aviator.runtime.type.AviatorObject;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

public class StuAviator {
    public static void main(String[] args) {
        Long result = (Long) AviatorEvaluator.execute("1+2+3");
        System.out.println(result);
    }
    
    @Test
    public void method1() {
        String name = "唐简";
        Map<String,Object> env = new HashMap<>();
        env.put("name", name);
        String result = (String) AviatorEvaluator.execute(" 'Hello ' + name ", env);
        System.out.println(result);
    }
    @Test
    public void method2() {
        String str = "小哥哥带你使用Aviator";
        Map<String,Object> env = new HashMap<>();
        env.put("str",str);
        Long length = (Long)AviatorEvaluator.execute("string.length(str)",env);
        System.out.println(length);
    }
//    通过上面的代码片段可以看到
//    使用compile方法，先生成了 Expression 最后再由
//    Expression.execute，然后传入参数 map，进行计算
//    这么做的目的是，在我们实际使用过程中
//    很多情况下，我们要计算的公式都是一样的，只是每次的参数有所区别。
//    我们可以把一个编译好的Expression 缓存起来。
//    这样每次可以直接获取我们之前编译的结果直接进行计算，避免Perm区OutOfMemory
//    Aviator本身自带一个全局缓存
//    如果决定缓存本次的编译结果，只需要
//    Expression compiledExp = AviatorEvaluator.compile(expression,true);
//    这样设置后，下一次编译同样的表达式，Aviator会自从从全局缓存中，拿出已经编译好的结果，不需要动态编译。如果需要使缓存失效，可以使用
//    AviatorEvaluator.invalidateCache(String expression);
    @Test
    public void method3() {
        String expression = "a-(b-c)>100";
        Expression compiledExp = AviatorEvaluator.compile(expression);
        Map<String, Object> env = new HashMap<>();
        env.put("a", 100.3);
        env.put("b", 45);
        env.put("c", -199.100);
        Boolean result = (Boolean) compiledExp.execute(env);
        System.out.println("result==>"+result);

    }
    
    @Test
    public void method4() {
        AviatorEvaluator.addFunction(new MinFunction());
        String expression = "min(a,b)";
        Expression compiledExp = AviatorEvaluator.compile(expression, true);
        Map<String, Object> env = new HashMap<>();
        env.put("a", 100.3);
        env.put("b", 45);
        Double result = (Double) compiledExp.execute(env);
        System.out.println(result);
    }
    static class MinFunction extends AbstractFunction {
        @Override public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
            System.out.println(arg1);
            System.out.println(arg2);
            Number left = FunctionUtils.getNumberValue(arg1, env);
            Number right = FunctionUtils.getNumberValue(arg2, env);
            return new AviatorBigInt(Math.min(left.doubleValue(), right.doubleValue()));
        }

        public String getName() {
            return "min";
        }
    }
    // 谷歌浏览器 https://code.google.com/archive/p/aviator/wikis/User_Guide_zh.wiki
    // https://github.com/killme2008/aviatorscript/blob/master/src/test/java/com/googlecode/aviator/example/BigNumberExample.java
    @Test
    public void method5() {
        BigInteger a = new BigInteger(String.valueOf(Long.MAX_VALUE) + String.valueOf(Long.MAX_VALUE));
        BigDecimal b = new BigDecimal("3.2");
        BigDecimal c = new BigDecimal("9999.99999");

        Object rt = AviatorEvaluator.exec("a+10000000000000000000", a);
        System.out.println(rt + "  " + rt.getClass());

        rt = AviatorEvaluator.exec("b+c*2", b, c);
        System.out.println(rt + "  " + rt.getClass());

        rt = AviatorEvaluator.exec("a*b/c", a, b, c);
        System.out.println(rt + "  " + rt.getClass());
    }

    @Test
    public void method6() {
        Object rt = AviatorEvaluator.execute("9223372036854775807100.356M * 2");
        System.out.println(rt + "  " + rt.getClass());

        rt = AviatorEvaluator.execute("92233720368547758074+1000");
        System.out.println(rt + "  " + rt.getClass());

        BigInteger a = new BigInteger(String.valueOf(Long.MAX_VALUE) + String.valueOf(Long.MAX_VALUE));
        BigDecimal b = new BigDecimal("3.2");
        BigDecimal c = new BigDecimal("9999.99999");

        Map<String, Object> env = AviatorEvaluator.newEnv("a", a, "b", b, "c", c);

        rt = AviatorEvaluator.execute("a+10000000000000000000", env);
        System.out.println(rt + "  " + rt.getClass());

        rt = AviatorEvaluator.execute("b+c*2", env);
        System.out.println(rt + "  " + rt.getClass());

        rt = AviatorEvaluator.execute("a*b/c", env);
        System.out.println(rt + "  " + rt.getClass());

        // set math context
        AviatorEvaluator.setOption(Options.MATH_CONTEXT, MathContext.DECIMAL64);
        rt = AviatorEvaluator.execute("a*b/c", env);
        System.out.println(rt + "  " + rt.getClass());
    }

    @Test
    public void method7() {
        BigDecimal b = new BigDecimal("0.1");
        BigDecimal c = new BigDecimal("0.2");

        Map<String, Object> env = AviatorEvaluator.newEnv("b", b, "c", c);

       Object rt = AviatorEvaluator.execute("b+ c", env);
        System.out.println(rt + "  " + rt.getClass());

        rt = AviatorEvaluator.execute("b +c*2", env);
        System.out.println(rt + "  " + rt.getClass());

        rt = AviatorEvaluator.execute("b/c", env);
        System.out.println(rt + "  " + rt.getClass());
    }
}
