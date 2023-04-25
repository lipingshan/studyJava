package java_basic.javaIO.stu01流的初步认识.stu06内存流;

import org.junit.Test;

import java.io.*;
//https://www.cnblogs.com/ysocean/p/6864080.html
public class Neicun1 {

//字节内存流：ByteArrayOutputStream 、ByteArrayInputStream
    public static void main(String[] args) {
        //字节数组输出流：程序---》内存

        try (
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ){
            //将数据写入到内存中
            bos.write("ABCD".getBytes());
            //创建一个新分配的字节数组。 其大小是此输出流的当前大小，缓冲区的有效内容已被复制到其中。
            byte[] temp = bos.toByteArray();

            //System.out.println(new String(temp, 0, temp.length));

            byte[] buffer = new byte[10];
            ///字节数组输入流：内存---》程序
            ByteArrayInputStream  bis = new ByteArrayInputStream(temp);
            int len = -1;
            while ((len = bis.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }

            //这里不写也没事，因为源码中的 close()是一个空的方法体
            //bos.close();
            //bis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //字符内存流：CharArrayReader、CharArrayWriter
    @Test
    public void method() {
        CharArrayWriter caw = new CharArrayWriter();
        try {
            caw.write("ABCD");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //返回内存数据的副本
        char[] temp = caw.toCharArray();
        System.out.println(new String(temp));

        //字符数组输入流
        CharArrayReader car = new CharArrayReader(temp);
        char[] buffer = new char[10];
        int len = -1;
        try {
            while((len=car.read(buffer))!=-1){
                System.out.println(new String(buffer,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
