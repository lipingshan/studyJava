package java_basic.javaIO.stu01流的初步认识.stu01File;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

//https://www.cnblogs.com/ysocean/p/6851878.html

//File
public class StuFile {
    public static void main(String[] args) throws IOException {
        // 1.分隔符
        System.out.println(File.separator);// \ File.separator是用来分隔同一个路径字符串中的目录的
        System.out.println(File.pathSeparator);//  ;  File.pathSeparator指的是分隔连续多个路径字符串的分隔符

        File file = new File("./abc.txt");
        //2.创建文件
        boolean res = file.createNewFile();//返回值为 boolean　
        // 会在src 下出现一个文件。如果该文件已经存在，则返回false,表示不在创建文件。
        System.out.println("res=>"+res);//res=>false
        System.out.println(file.getPath());
        //3.文件的绝对路径
        System.out.println(file.getAbsoluteFile());//E:\idea\svn\repositorylocation\studyJava\.\abc.txt
        //4.设置文件为 可写（true）/不可写(false)
       file.setWritable(true);
        // 5.文件是否可写
        System.out.println(file.canWrite());
        // 6.文件或者是否存在
        System.out.println(file.exists());//true
        // 7.是否是文件夹
        System.out.println(file.isDirectory());//false
        // 8.是否是文件
        System.out.println(file.isFile());//true
        // 9.是否是隐藏文件
        System.out.println(file.isHidden());//true
        // 10.最后一次的修改时间
        System.out.println(file.lastModified());//1612839518304
        // 11.文件的长度
        System.out.println(file.length());// 字节数  汉字三个字节
    }

    @Test
    public void method1() throws IOException {
        File file = new File("./stuFile/file0/fileA");
        // 判断文件夹是否存在
        if(!file.exists()){
            // 创建文件夹
           boolean rb = file.mkdirs();
            System.out.println("创建文件夹成功。。。" + (rb));
        }
        // 添加文件
        new File(file.getParentFile(),"aaa.txt").createNewFile();
        new File(file.getParentFile(),"bbb.txt").createNewFile();
        new File(file,"ccc.txt").createNewFile();

        //boolean del = file.delete(); 删除文件或文件夹 只能删除一层
       //deleteDir(new File("./stuFile"));
    }
    public static void deleteDir(File file) {
        if (file.isDirectory()) {
            for (File f : file.listFiles()){
                System.out.println("删除"+f.getAbsolutePath()+"\\"+f.getName());
                deleteDir(f);
            }
        }
        file.delete();
    }

}
