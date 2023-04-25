package java_basic.javaIO.stu01流的初步认识.stu07字符串流;
//字符串流
//字符串流：StringReader,StringWriter（把数据临时存储到字符串中）

import java.io.StringReader;
import java.io.StringWriter;

//https://www.cnblogs.com/ysocean/p/6864080.html
public class StrWR {
    public static void main(String[] args) {
        //字符串输出流,底层采用 StringBuffer 进行拼接
        StringWriter sw = new StringWriter();
        sw.write("ABCD");
        sw.write("帅锅");
        System.out.println(sw.toString());//ABCD帅锅

        sw.append("lalala");
        //字符串输入流
        StringReader sr = new StringReader(sw.toString());
        char[] buffer = new char[10];
        int len = -1;
        try {
            while((len=sr.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len));//ABCD帅锅
            }
        }catch (Exception e){

        }
    }
}
