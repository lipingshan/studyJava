package java_basic.javaIO.stu01流的初步认识.stu03字符流;

import org.junit.Test;

import java.io.*;

//https://www.cnblogs.com/ysocean/p/6859242.html

//FileReader ------ FileWriter
public class FileRW {
//    什么情况下使用字符流？
//    一般可以用记事本打开的文件，我们可以看到内容不乱码的。就是文本文件，可以使用字符流。而操作二进制文件（比如图片、音频、视频）必须使用字节流

    public static void main(String[] args) {
        try(FileReader fr = new FileReader(new File("./stuFile/file0/fileA/ccc.txt"));) {
            char[] size = new char[2];
            int len = -1;
            while((len=fr.read(size))!=-1){
                System.out.println(new String(size,0,len));;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method() {
        // 不加true 不能追加
        try( FileWriter fw = new FileWriter(new File("./stuFile/file0/fileA/ccc.txt"),true);) {
            fw.write("绝胜烟柳满皇都");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method1() {
        char a='我';
        System.out.println(a);
    }
}
