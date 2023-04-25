package java_basic.javaIO.stu01流的初步认识.stu08合并流;

import java.io.*;
import java.nio.charset.StandardCharsets;

//https://www.cnblogs.com/ysocean/p/6864080.html
public class Hebing {
    public static void main(String[] args) {
        SequenceInputStream seinput = null;
        try {
            seinput = new SequenceInputStream(
                    new FileInputStream("./stuFile/fileB/ggg.txt"), new FileInputStream("./stuFile/fileB/hhh.txt"));

//            byte[] buffer = new byte[10];
//            int len = -1;
//            while((len=seinput.read(buffer))!=-1){
//                System.out.println(new String(buffer,0,len));
//            }

            InputStreamReader isr = new InputStreamReader(seinput, StandardCharsets.UTF_8);
            char[] buff = new char[10];
            int len = -1;
            while((len=isr.read(buff))!=-1){
                System.out.println(new String(buff,0,len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                seinput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
