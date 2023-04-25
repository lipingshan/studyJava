package java_basic.javaIO.stu01流的初步认识.stu05流链接;

import org.junit.Test;

import java.io.*;

import java.nio.charset.StandardCharsets;

// 流连接 用于处理文本
// 参考文档https://www.jb51.net/article/105418.htm

public class HandleTxt {
    @Test
    public void method() {
        String f1 = "./stuFile/fileB/eee.txt";
//        String f2 = "./stuFile/fileA/fileC/abc.wmv";

        File file = new File(f1);
        File file1 = new File("./stuFile/fileB/kkk.txt");
        try (
                // --- 读数据 ---
                // 字节流
                InputStream inputStream = new FileInputStream(file);
                // 转换流 将字节转为字符
                InputStreamReader isr = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                // 缓冲流 加快读的速度
                BufferedReader br = new BufferedReader(isr);

                // --- 写数据 ---
                // 字节流
                OutputStream outputStream = new FileOutputStream(file1,true); // file1不存在会自动创建 内容追加
                // 转换流 将字符转为字节
                OutputStreamWriter osw = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
                // 缓冲流 加快写的速度
                BufferedWriter bw = new BufferedWriter(osw);
                PrintWriter pw = new PrintWriter(bw);//自动行刷新

        ) {
            String line;
            while((line=br.readLine())!=null){
                //bw.write(line); // 不会自动换行
                pw.println(line); // 会自动换行
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
