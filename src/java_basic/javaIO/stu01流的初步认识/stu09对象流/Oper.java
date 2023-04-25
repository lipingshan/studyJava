package java_basic.javaIO.stu01流的初步认识.stu09对象流;

import org.junit.Test;

import java.io.*;

public class Oper {

    // 序列化 注意 要序列化的对象 必须实现Serializable 接口
    public static void main(String[] args)  {
        //在根目录下新建一个 io 的文件夹
        OutputStream op = null;
        ObjectOutputStream ops = null;
        try {
            String path = "./stuFile/fileB/mmm.txt".replaceAll("//",File.separator);
            op = new FileOutputStream(path);
            ops = new ObjectOutputStream(op);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                ops.writeObject(new Person("vae",1));
                ops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void method() {
        try {
            String path = "./stuFile/fileB/mmm.txt".replaceAll("//",File.separator);
            InputStream in = new FileInputStream(path);
            ObjectInputStream os = new ObjectInputStream(in);
            Person p = (Person) os.readObject();
            System.out.println(p);  //Person [name=vae, age=1]
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
