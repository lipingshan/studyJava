package java_basic.javaIO.stu01流的初步认识.stu10随机访问文件流;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;

// 在RAF_02的基础上来根据用户名修改用户昵称
public class RAF_03 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入用户姓名：");
        String name = sc.nextLine();
        System.out.println("请输入更改昵称：");
        String nickname = sc.nextLine();

        RandomAccessFile raf = new RandomAccessFile("./stuFile/fileA/raf04.txt", "rw");

        //表示:无此用户
        boolean have = false;
        for (int i = 0; i < raf.length() / 100; i++) {
            //先将指针移动到该条记录的开始位置
            raf.seek(i * 100);
            //读用户名
            byte[] data = new byte[32];
            raf.read(data);
            String username = new String(data, "UTF-8").trim();
            if (username.equals(name)) {
                //修改昵称
                //1 将指针移动到昵称的位置
                raf.seek(i * 100 + 64);
                //2 写入32字节的新昵称数据
                data = nickname.getBytes("UTF-8");
                data = Arrays.copyOf(data, 32);
                raf.write(data);
                System.out.println("修改成功!");
                have = true;
                break;
            }
        }
        if (!have) {
            System.out.println("没有此用户");
        }

        raf.close();
    }
}
