package java_basic.javaIO.stu01流的初步认识.stu04处理流;
// https://www.cnblogs.com/ysocean/p/6864080.html

// 处理流 也叫包装流  前面的字节流 字符流 归类为节点流

import java_basic.javaIO.stu01流的初步认识.stu03字符流.FileRW;
import org.junit.Test;

import java.io.*;

//前面讲的字符输入输出流，字节输入输出流都是字节流。那么什么是包装流呢？
//
//        　　①、包装流隐藏了底层节点流的差异，并对外提供了更方便的输入\输出功能，让我们只关心这个高级流的操作
//
//        　　②、使用包装流包装了节点流，程序直接操作包装流，而底层还是节点流和IO设备操作
//
//        　　③、关闭包装流的时候，只需要关闭包装流即可
public class FileHandle {
// *******************
// 介绍两种处理流
//    1 缓冲流
//    2 转换流
// *******************


// --- 1 缓冲流 ---
//缓冲流：是一个包装流，目的是缓存作用，加快读取和写入数据的速度。
//字节缓冲流：BufferedInputStream、BufferedOutputStream
//字符缓冲流：BufferedReader、BufferedWriter


    // --------------------
// ----1.1字节缓冲流
// --------------------
    @Test
    public void method() {

        //  -- 字节缓冲输入流BufferedInputStream
        File file = getFile("./stuFile/fileB/eee.txt");
        try (
                InputStream fis = new FileInputStream(file);
                BufferedInputStream bis = new BufferedInputStream(fis);

        ) {
            byte[] buff = new byte[3];
            int len = -1;
            String res;
            while ((len = bis.read(buff)) != -1) {
                res = new String(buff, 0, len, "UTF-8");
                System.out.println(res);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void method1() {
        // ---字节缓冲输出流BufferedOutputStream
        File file = getFile("./stuFile/fileB/fff.txt");
        try (OutputStream fos = new FileOutputStream(file, true);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
        ) {
            bos.write("半缘修道半缘君".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // --------------------
// ----1.2字符缓冲流
// --------------------
    @Test
    public void method2() {
        //  -- 字符缓冲输入流：BufferedReader
        File file = getFile("./stuFile/fileB/ggg.txt");
        try (
                FileReader fileReader = new FileReader(file);
                BufferedReader br = new BufferedReader(fileReader);
        ) {
            char[] buffer = new char[20];
            int len = -1;
            while ((len = br.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method3() {
        //  -- 字符缓冲输出流：BufferedWriter
        File file = getFile("./stuFile/fileB/ggg.txt");
        try (
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fileWriter);
        ) {
            bw.write("大胆妖孽，我看你是没把我放在眼里。大威天龙，师尊地藏");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


// --- 2 转换流 ---
//    转换流：把字节流转换为字符流
//　　InputStreamReader:把字节输入流转换为字符输入流
//　　OutputStreamWriter:把字节输出流转换为字符输出流

    // 通过 转换流实现文本文件的 复制
    @Test
    public void method4() {
        File file_from = getFile("./stuFile/fileB/hhh.txt");
        File file_to = getFile("./stuFile/fileB/iii.txt");


        try (
                // 字节流
                InputStream inputStream = new FileInputStream(file_from);
                OutputStream outputStream = new FileOutputStream(file_to,true);// 加 true 表示追加
                // 转换流
                InputStreamReader isr = new InputStreamReader(inputStream,"utf-8");//指定字符集
                OutputStreamWriter osw = new OutputStreamWriter(outputStream,"utf-8");//指定字符集
        ) {
            char [] buffer = new char[2];
            int len = -1;
            while((len = isr.read(buffer))!=-1){
                osw.write(buffer,0,len);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // 文件夹不存在 则创建文件夹
    public File getFile(String filepath) {
        File file = new File(filepath);

        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        // 文件不存在则创建文件
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("创建新文件");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
