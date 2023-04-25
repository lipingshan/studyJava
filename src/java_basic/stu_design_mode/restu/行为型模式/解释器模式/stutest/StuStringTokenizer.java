package java_basic.stu_design_mode.restu.行为型模式.解释器模式.stutest;

import java.util.StringTokenizer;

// 处理 字符串根据界定符号拆分的类StringTokenizer
// 参考文档 https://www.runoob.com/w3cnote/java-stringtokenizer-intro.html
public class StuStringTokenizer {
    public static void main(String[] args) {
        String a="my name is kangkang , how are you ?";
        String b = "my,name,is,kangkang , how are you ?";
        //1. StringTokenizer(String str) ：构造一个用来解析 str 的 StringTokenizer 对象。java 默认的分隔符是空格("")、制表符(\t)、换行符(\n)、回车符(\r)。
        StringTokenizer stringTokenizer = new StringTokenizer(a);
        while(stringTokenizer.hasMoreElements()){
            System.out.print(stringTokenizer.nextToken()+" || ");
        }
        System.out.println();
        //2. StringTokenizer(String str, String delim) ：构造一个用来解析 str 的 StringTokenizer 对象，并提供一个指定的分隔符。
        StringTokenizer stringTokenizer1 = new StringTokenizer(b,",");
        while(stringTokenizer1.hasMoreElements()){
            System.out.print(stringTokenizer1.nextToken()+" || ");
        }
        System.out.println();
        //3. StringTokenizer(String str, String delim, boolean returnDelims) ：构造一个用来解析 str 的 StringTokenizer 对象，并提供一个指定的分隔符，同时，指定是否返回分隔符。
        StringTokenizer stringTokenizer2 = new StringTokenizer(b,",",true);
        while(stringTokenizer2.hasMoreElements()){
            System.out.print(stringTokenizer2.nextToken()+" || ");
        }
        System.out.println(" StringTokenizer 常用方法：");
//        StringTokenizer 常用方法：
//        1. int countTokens()：返回nextToken方法被调用的次数。
//        2. boolean hasMoreTokens()：返回是否还有分隔符。
//        3. boolean hasMoreElements()：判断枚举 （Enumeration） 对象中是否还有数据。
//        4. String nextToken()：返回从当前位置到下一个分隔符的字符串。
//        5. Object nextElement()：返回枚举 （Enumeration） 对象的下一个元素。
//        6. String nextToken(String delim)：与 4 类似，以指定的分隔符返回结果。
        //System.out.println(stringTokenizer2.countTokens());

        String[] res  = b.split(",");
        for(String s:res){
            System.out.print(s+" || ");
        }





    }
}
