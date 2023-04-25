package java_basic.stu_design_mode.restu.行为型模式.解释器模式.expression4j;



import fr.expression4j.basic.MathematicalElement;
import fr.expression4j.basic.OperatorManager;
import fr.expression4j.core.Catalog;
import fr.expression4j.core.Expression;
import fr.expression4j.core.Parameters;
import fr.expression4j.core.exception.EvalException;
import fr.expression4j.core.exception.ParametersException;
import fr.expression4j.core.exception.ParsingException;
import fr.expression4j.core.predefine.AbstractFunction;
import fr.expression4j.factory.ExpressionFactory;
import fr.expression4j.factory.NumberFactory;
import fr.expression4j.util.ParameterUtil;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

import java.net.URL;
import java.util.List;
import java.util.Map;

public class StuExp4j {
    static {
        // log4j 普通项目配置
        //https://my.oschina.net/hzchenyh/blog/749456
        //https://www.cnblogs.com/zhangguangxiang/p/12007924.html
//        System.out.println(StuExp4j.class.getResource(""));
//        System.out.println(StuExp4j.class.getResource("/"));

        URL log4jRes = StuExp4j.class.getClass().getResource("/properties/log4j.properties");
        System.out.println("log4jRes==>"+log4jRes);
        PropertyConfigurator.configure(log4jRes);
    }
    public static void main(String[] args) {
        try {

            Expression exp1 = ExpressionFactory.createExpression("f1(x)=x*x");
            Expression exp2 = ExpressionFactory.createExpression("f2(b,a,c)=f1(b)-4*a*c");
            Parameters params = ExpressionFactory.createParameters();
            params.addParameter("b", NumberFactory.createReal(4));
            params.addParameter("a", NumberFactory.createReal(2));
            params.addParameter("c", NumberFactory.createReal(2));
            double val = exp2.evaluate(params).getRealValue();
            System.out.println("exp2 name:" + exp2.getName());
            System.out.println("exp2:" + exp2);
            System.out.println("exp2 result:" + val);

        } catch (ParsingException e) {
            e.printStackTrace();
        } catch (EvalException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void method() {
        try {
            Expression exp = ExpressionFactory.createExpression("f()=2.4e-2*1000");//不能有空格
            double val = exp.evaluate(null).getRealValue();
            System.out.println("exp name:" + exp.getName());
            System.out.println("exp:" + exp);
            System.out.println("result:" + val);

            Expression exp2 = ExpressionFactory.createExpression("func(x,y,z)=x+y*z");
            Parameters params = ExpressionFactory.createParameters();
            params.addParameter("x", NumberFactory.createReal(1));
            params.addParameter("y", NumberFactory.createReal(2));
            params.addParameter("z", NumberFactory.createReal(3));
            double val2 = exp2.evaluate(params).getRealValue();
            System.out.println("exp2 name:" + exp2.getName());
            System.out.println("exp2:" + exp2);
            System.out.println("exp2 result:" + val2);

        } catch (ParsingException e) {
            e.printStackTrace();
        } catch (EvalException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void method1() {
        try {
            Expression exp = ExpressionFactory.createExpression("f()=1/3");//不能有空格
            double val = exp.evaluate(null).getRealValue();
            System.out.println("exp name:" + exp.getName());
            System.out.println("exp:" + exp);
            System.out.println("result:" + val);
        } catch (ParsingException e) {
            e.printStackTrace();
        } catch (EvalException e) {
            e.printStackTrace();
        }
    }

    // 预定义函数
    @Test
    public void method2() {
        //		abs(x)		绝对值
//		acos(x)		反余弦值
//		asin(x)		反正弦值
//		atan(x)		反正切
//		ceil(x)		向上取整
//		cos(x)		余弦
//		cosh(x)		双曲余弦
//		exp(x)		e的x次幂
//		floor(x)	向下取整
//		log(x)		对数
//		random()	随机数
//		sin(x)		正弦
//		sinh(x)		双曲正弦
//		sqrt(x)		平方根
//		tan(x)		正切
        try {
            Expression exp1 = ExpressionFactory.createExpression("f()=random()");

            double val = exp1.evaluate(null).getRealValue();
            System.out.println("result:" + val);
        } catch (ParsingException e) {
            e.printStackTrace();
        } catch (EvalException e) {
            e.printStackTrace();
        }

    }

    // 自定义函数  不会用感觉比较鸡肋
    @Test
    public void method3() {
        try {
            Catalog catalog = ExpressionFactory.getCatalog();
            catalog.addExpression(new Myfun());
            Expression exp = ExpressionFactory.createExpression("f()=fact(4)");
            Parameters params = ExpressionFactory.createParameters();
            double val = exp.evaluate(params).getRealValue();
            System.out.println("result:" + val);
        } catch (ParsingException e) {
            e.printStackTrace();
        } catch (EvalException e) {
            e.printStackTrace();
        }


    }

    class Myfun extends AbstractFunction {


        /**
         * compute the factoriel of a number
         * @param x number to compute
         * @return factoriel of the number.
         */
        private double fact(double x) {

            return x *2;
        }

        /**
         * evaluation method called by the Expression4j when needed.
         *
         * @param parameters parameter given to the function for the evaluation.
         */
        public MathematicalElement evaluate(Parameters parameters)
                throws EvalException {

            System.out.println("x==>"+parameters.getParameters().get("x"));
            try {
                MathematicalElement me = parameters.getParameter("x");
                System.out.println("me==>"+me);
                double tmpValue = me.getRealValue();
                if (tmpValue < 0) {
                    throw new EvalException(
                            "Cannot evaluate fact of " +
                                    "negativ number.");
                }
                double result = fact(tmpValue);
                return NumberFactory.createReal(result);
            }
            catch (ParametersException pe) {
                throw new EvalException("Cannot evaluate fact(x). " + pe);
            }
        }

        public MathematicalElement evaluate(OperatorManager operatorManager,
                                            Parameters parameters) throws EvalException {
            return evaluate(parameters);
        }

        public Catalog getCatalog() {
            return ExpressionFactory.getCatalog();
        }

        /**
         * get the function name
         */
        public String getName() {
            return "fact";
        }

        /**
         * get parameter list of the function.
         */
        public List getParameters() {
            //this util method get one parameter "x".
            return ParameterUtil.generateXParameters();
        }

    }

}
