package java_basic.javaIO.stu01流的初步认识.stu02字节流;

import org.junit.Test;

import java.io.*;

//https://www.cnblogs.com/ysocean/p/6854541.html

//FileInputStream ------ FileOutputStream

public class FileIO {
    public static void main(String[] args)  {
        //2、创建文件的字节输出流对象,第二个参数是 Boolean 类型，true 表示后面写入的文件追加到数据后面，false(默认) 表示覆盖
        // 为了避免再去在finally中关闭流可以这样写
        try(OutputStream  fos = new FileOutputStream(new File("./stuFile/file0/fileA/ccc.txt"),true)){
            fos.write("hello大威天龙".getBytes());
            fos.write("山重水复疑无路。".getBytes("UTF-8"));
//            fos.write("柳暗花明又一村。".getBytes("GBK"));
            // flush()是强行将缓冲区中的内容输出，否则直到缓冲区满后才会一次性的将内容输出
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  @Test
  public void method() {

      try (InputStream fis = new FileInputStream(new File("./stuFile/file0/fileA/ccc.txt"))) {
          byte[] can = new byte[12];
          int temp=-1;
          String st="";
          while((temp=fis.read(can))!=-1){
              System.out.println("temp==>"+temp);
              st = new String(can,0,temp,"UTF-8");
              // 通过FileInputStream 拿到的字节不能直接使用，这是由于每一次读取是按照字节，可能将汉字给拆碎。
               //因为使用字节流操作汉字或特殊符号语言的时候容易乱码，因为汉字不止一个字节，为了解决这个问题，建议使用字符流。
              System.out.println(st);
          }

      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }
  }

}
