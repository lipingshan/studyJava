package java_basic.javaIO.stu01流的初步认识.stu06内存流;

import org.junit.Test;

import java.io.*;

//参考文档
//https://www.cnblogs.com/ysocean/p/6864080.html
//https://www.jb51.net/article/75961.htm
public class Neicun2 {
    public static void main(String[] args) {

        transform(System.in, System.out); // 从键盘读，输出到显示器

    }
    @Test
    public void show(){
        String str = "abcdef";
        ByteArrayInputStream in = new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        transform(in, out);
        byte[] result = out.toByteArray();
        System.out.println(out);
        System.out.println(new String(result));
    }

    public static void transform(InputStream in, OutputStream out) {
        int ch = 0;
        try {
            while ((ch = in.read()) != -1) {
                int upperChar = Character.toUpperCase((char) ch);
                out.write(upperChar);
            } // close while
        } catch (Exception e) {

        }
    }
}
