package java_basic.stu_design_mode.restu.行为型模式.解释器模式.fel;

import com.greenpineyu.fel.Expression;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.common.ObjectUtils;
import com.greenpineyu.fel.context.AbstractContext;
import com.greenpineyu.fel.context.ContextChain;
import com.greenpineyu.fel.context.FelContext;
import com.greenpineyu.fel.context.MapContext;
import com.greenpineyu.fel.function.CommonFunction;
import com.greenpineyu.fel.function.Function;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
// 底层是double 实现的，暂时未找到解决方法。
public class StuFEL {
    private static FelEngine fel = new FelEngineImpl();
//        1：算术表达式：    
    public static void main(String[] args) {


        Object result = fel.eval("5000*12+7500");
        System.out.println(result);

    }
//        2：变量
//        使用变量，其代码如下所示：
    @Test
    public void method() {

        FelContext ctx = fel.getContext();
        ctx.set("单价", 5000);
        ctx.set("数量", 12);
        ctx.set("运费", 7500);
        Object result = fel.eval("单价*数量+运费");
        System.out.println(result);
    }
//        3：访问对象属性
//        在Fel中，可能非常方便的访问对象属性，示例代码如下所示    
    @Test
    public void method1() {

        FelEngine fel = new FelEngineImpl();
        FelContext ctx = fel.getContext();
        Foo foo = new Foo();
        foo.setName("小红");
        ctx.set("foo", foo);
        Map<String,String> m = new HashMap<String,String>();
        m.put("ElName", "fel");
        ctx.set("m",m);

//调用foo.getSize()方法。
        Object result = fel.eval("foo.size");

//调用foo.isSample()方法。
        result = fel.eval("foo.sample");

//foo没有name、getName、isName方法
//foo.name会调用foo.get("name")方法。
        result = fel.eval("foo.name");
        System.out.println("name=>"+result);
//m.ElName会调用m.get("ElName");
        result = fel.eval("m.ElName");
       
    }

   public  class Foo{
        private String name;
        private int size;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public String showMessage(String st){
            System.out.println("the message is : "+st);
            return "返回信息";
        }
    }
//    4:访问数组、集合、Map
    @Test
    public void method2() {
        FelEngine fel = new FelEngineImpl();
        FelContext ctx = fel.getContext();

//数组
        int[] intArray = {1,2,3};
        ctx.set("intArray",intArray);
//获取intArray[0]
        String exp = "intArray[0]";
        System.out.println(exp+"->"+fel.eval(exp));

//List
        List<Integer> list = Arrays.asList(1,2,3);
        ctx.set("list",list);
//获取list.get(0)
        exp = "list[0]";
        System.out.println(exp+"->"+fel.eval(exp));

//集合
        Collection<String> coll = Arrays.asList("a","b","c");
        ctx.set("coll",coll);
//获取集合最前面的元素。执行结果为"a"
        exp = "coll[0]";
        System.out.println(exp+"->"+fel.eval(exp));

//迭代器
        Iterator<String> iterator = coll.iterator();
        ctx.set("iterator", iterator);
//获取迭代器最前面的元素。执行结果为"a"
        exp = "iterator[0]";
        System.out.println(exp+"->"+fel.eval(exp));

//Map
        Map<String,String> m = new HashMap<String, String>();
        m.put("name", "HashMap");
        ctx.set("map",m);
        exp = "map.name";
        System.out.println(exp+"->"+fel.eval(exp));

//多维数组
        int[][] intArrays= {{11,12},{21,22}};
        ctx.set("intArrays",intArrays);
        exp = "intArrays[0][0]";
        System.out.println(exp+"->"+fel.eval(exp));

//多维综合体，支持数组、集合的任意组合。
        List<int[]> listArray = new ArrayList<int[]>();
        listArray.add(new int[]{1,2,3});
        listArray.add(new int[]{4,5,6});
        ctx.set("listArray",listArray);
        exp = "listArray[0][0]";
        System.out.println(exp+"->"+fel.eval(exp));
    }
//    5:调用JAVA方法
    @Test
    public void method3() {
        FelEngine fel = new FelEngineImpl();
        Foo foo = new Foo();
        FelContext ctx = fel.getContext();
        ctx.set("out", System.out);
        fel.eval("out.println('Hello Everybody'.substring(6))");
        System.out.println("#######");
        ctx.set("show",foo);
        fel.eval("show.showMessage('Hello Everybody')");


    }

//6:自定义上下文环境
//负责提供气象服务的上下文环境
    @Test
    public void method4() {

        FelContext ctx = new AbstractContext() {
            @Override
            public Object get(String s) {
                if("天气".equals(s)){
                    return "晴";
                }
                if("温度".equals(s)){
                    return 25;
                }
                return null;
            }
        };
        FelEngine fel = new FelEngineImpl(ctx);
        Object eval = fel.eval("'天气:'+天气+';温度:'+温度");
        System.out.println(eval);
    }
//7:多层上下文环境（命名空间）
    @Test
    public void method5() {
        FelEngine fel = new FelEngineImpl();
        String costStr = "成本";
        String priceStr="价格";
        FelContext baseCtx = fel.getContext();
//父级上下文中设置成本和价格
        baseCtx.set(costStr, 50);
        baseCtx.set(priceStr,100);

        String exp = priceStr+"-"+costStr;
        Object baseCost = fel.eval(exp);
        System.out.println("期望利润：" + baseCost);
        FelContext Mctx = new MapContext();
        Mctx.set(costStr,80);
        Mctx.set("xyz",123);
        FelContext ctx = new ContextChain(baseCtx, Mctx);
//通货膨胀导致成本增加（子级上下文 中设置成本，会覆盖父级上下文中的成本）
        System.out.println("==>"+Mctx.get(costStr));
//        ctx.set(costStr,50+20 );
        System.out.println("******");
//        baseCtx.set(costStr,99 );
        System.out.println("baseCtx.get(costStr)=>"+baseCtx.get(costStr));
        System.out.println("ctx.get(costStr)=>"+ctx.get(costStr));
        System.out.println("Mctx.get(costStr)=>"+Mctx.get(costStr));
        System.out.println(ctx.get("xyz"));
        Object allCost = fel.eval(exp, ctx);

        System.out.println("实际利润：" + allCost);
    }

    //8:编译执行
    //备注：适合处理海量数据，编译执行的速度基本与Java字节码执行速度一样快。
    @Test
    public void method6() {
        FelEngine fel = new FelEngineImpl();
        FelContext ctx = fel.getContext();
        ctx.set("单价", 5000);
        ctx.set("数量", 12);
        ctx.set("运费", 7500);
        Expression exp = fel.compile("单价*数量+运费",ctx);
        Object result = exp.eval(ctx);
        System.out.println(result);
    }
    //9:自定义函数
    @Test
    public void method7() {

        //定义hello函数
        Function fun = new CommonFunction() {
            public String getName() {
                return "hello";
            }
            /*
             * 调用hello("xxx")时执行的代码
             */
            @Override
            public Object call(Object[] arguments) {
                Object msg = null;
                if(arguments!= null && arguments.length>0){
                    msg = arguments[0];
                }
                return ObjectUtils.toString(msg);
            }

        };
        FelEngine e = new FelEngineImpl();
        //添加函数到引擎中。
        e.addFun(fun);
        String exp = "hello('fel')";
        //解释执行
        Object eval = e.eval(exp);
        System.out.println("hello "+eval);
        //编译执行
        Expression compile = e.compile(exp, null);
        eval = compile.eval(null);
        System.out.println("hello "+eval);
    }

//    10:调用静态方法
//    如果你觉得上面的自定义函数也麻烦，Fel提供的$函数可以方便的调用工具类的方法
//    熟悉jQuery的朋友肯定知道"$"函数的威力。Fel东施效颦，也实现了一个"$"函数,其作用是获取class和创建对象。结合点操作符，可以轻易的调用工具类或对象的方法。
    @Test
    public void method8() {
        //调用Math.min(1,2)
        Object obj  = FelEngine.instance.eval("$('Math').min(1,2)");
        System.out.println(obj.toString());

        //调用new HashMap().toString();
        Map map=(Map)FelEngine.instance.eval("$('java.util.HashMap.new')");
        map.put("a",123);
        System.out.println(map.get("a"));
    }
// 精度问题 底层使用的是double 运算的
// 查找的解决方法 将数值变为整数再计算。感觉很傻逼，因为数据涉及到中间量的问题
    //https://www.cnblogs.com/boothsun/p/7995575.html
    @Test
    public void method9() {
        FelEngine fel = new FelEngineImpl();
        Object result = fel.eval("0.1+0.2");
        System.out.println(result);//0.30000000000000004
        double a = 0.1+0.2;
        System.out.println("a="+a);//0.30000000000000004

        System.out.println("*******************************");

//        FelContext ctx = fel.getContext();
//
//        BigDecimal bigDecimal1 = new BigDecimal("0.1");
//        BigDecimal bigDecimal2 = new BigDecimal("0.2");
//        ctx.set("单价", bigDecimal1);
//        ctx.set("数量", bigDecimal2);
//        Object result1 = fel.eval("单价+数量");
//        System.out.println("result1=>"+result1);// 还是不行
    }


}
