package java_basic.javaIO.stu01流的初步认识.stu10随机访问文件流;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RAF_02 {
    /*
     * ##############################################################################
     * 根据RandomAccessFile 随机读写的特点
     * 实现一个用户信息的 存取
     *
     * ##############################################################################
     *
     **/

    public static void main(String[] args) {
        List<String> inputs = new ArrayList<>(4);
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户姓名：");
        String name = sc.nextLine();
        inputs.add(name);

        System.out.println("请输入用户密码：");
        String pwd = sc.nextLine();
        inputs.add(pwd);

        System.out.println("请输入用户昵称：");
        String nickName = sc.nextLine();
        inputs.add(nickName);

        System.out.println("请输入用户年龄：");
        String age = sc.nextLine();
        inputs.add(age);

        File file = new File("./stuFile/fileA/raf04.txt");
        try(RandomAccessFile raf = new RandomAccessFile(file,"rw");){
            raf.seek(0);
            for(int i=0;i<inputs.size();i++){
                raf.seek(raf.length());
                byte[] data = inputs.get(i).getBytes(StandardCharsets.UTF_8);
                if(i==inputs.size()-1){
                    data = Arrays.copyOf(data,4);
                }else{
                    data = Arrays.copyOf(data,32);
                }
                raf.write(data);
                System.out.println("当前位置"+raf.getFilePointer());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 显示数据
    @Test
    public void method() {
        File file = new File("./stuFile/fileA/raf04.txt");
        try(RandomAccessFile raf = new RandomAccessFile(file,"r");){
            System.out.println("指针位置："+raf.getFilePointer());
            for(int i=0;i<raf.length()/100;i++) {
                //读用户名
                byte[] data = new byte[32];
                raf.read(data);//一次读32字节
                String name = new String(data,"UTF-8").trim();

                //读取密码
                raf.read(data);
                String password = new String(data,"UTF-8").trim();

                //读取昵称
                raf.read(data);
                String nickname = new String(data,"UTF-8").trim();

                //读取年龄
                byte[] size=new byte[4];
                raf.read(size);
                String age = new String(size,"UTF-8").trim();
                System.out.println(name+"\t"+password+"\t"+nickname+"\t"+age+"\t");
            }
            System.out.println("指针位置："+raf.getFilePointer());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
