package java_basic.javaIO.stu01流的初步认识.stu10随机访问文件流;

import java_basic.javaIO.stu01流的初步认识.stu10随机访问文件流.util.NumberUtil;
import org.junit.Test;

import java.io.*;
import java.util.Arrays;

public class RAF_01 {
    /*##############################################################################
     * section 1 读写模式
     *
     * RandomAccessFile常用构造方法:
     * RandomAccessFile(File file,String mode)
     * RandomAccessFile(String path,String mode)
     * 第一个参数用于指定要进行读写操作的文件。
     * 第二个参数为操作模式，常用:
     * r:只读模式，仅对文件进行读取操作
     * rw:读写模式，对文件数据可读也可写
     *
     * section 2 raf.write(int a)  raf.read()
     * raf.write(int a )的作用是写入 a的后八位 也就是一个字节 ； raf.read() 表示读一个字节。
     * 每一次读写指针位置回向后移动一个字节。
     * ##############################################################################
     */
    @Test
    public void method01() {

        File file = new File("./stuFile/fileA/raf01.txt");
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw");) {
            /*
             * void write(int d)
             * 向文件中写入一个字节，将给定的int值所对应的
             * 2进制的低八位写入文件 意思是当数据岛屿255时 就会出现数据丢失。
             *                            vvvvvvvv
             * 00000000 00000000 00000000 00000001
             */
            System.out.println("当前位置：" + (raf.getFilePointer()));
            raf.write(12121);// 此时存的是89
            long len = raf.length();
            System.out.println("当前长度：" + (len));//1
            System.out.println("当前位置1：" + (raf.getFilePointer()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method() {
        String bin = Integer.toBinaryString(12121);
        System.out.println(bin);//10111101011001
        // 获取12121 的后八位二进制 01011001
        //将该后八位二进制转为10进制
        int lastEight = NumberUtil.binary2Decimal("01011001");
        System.out.println(lastEight);//89
    }

    @Test
    public void method02() {
        File file = new File("./stuFile/fileA/raf01.txt");
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw");) {
            long len = raf.length();
            System.out.println("当前长度：" + (len));
            System.out.println("当前位置：" + (raf.getFilePointer()));
            System.out.println(raf.read());
            ;
            len = raf.length();
            System.out.println("当前长度1：" + (len));
            System.out.println("当前位置：" + (raf.getFilePointer()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * ##############################################################################
     * 块读 块写
     * 	/*
     * RAF提供的块读写操作的方法
     * 块读：
     * int read(byte[] data)
     * 通过当前RAF一次性读取给定的字节数组总长度的
     * 字节量，并装入到该数组中。返回值为实际读取到
     * 的字节量。若返回值为-1，则表示本次没有读取到
     * 任何数据(已经是文件末尾了)
     *
     * 块写:
     * void write(byte[] data)
     * 通过RAF将给定字节数组所有字节一次性写出
     *
     * void write(byte[] data,int offset,int len)
     * 将给定的字节数组从下标offset处的连续len个字节
     * 一次性写出
     * ##############################################################################
     **/
    @Test
    public void method03() {
        File file = new File("./stuFile/fileA/raf02.txt");
        File file1 = new File("./stuFile/fileA/raf02.txt");
        try (
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                RandomAccessFile raf1 = new RandomAccessFile(file1, "r");
        ) {
            raf.write("艳阳天风光好，红的花，绿的草".getBytes("UTF-8"));
            long len = raf1.length();//字节长度
            System.out.println("字节长度："+(len));
           // 按块读
            byte[] buff = new byte[(int) len];// 这里强转 是存在明显问题的 len 本是long 类型
            //System.out.println("long 的最大值："+(Long.MAX_VALUE));//9223372036854775807
            //System.out.println((Long.MAX_VALUE/(1024*1024*1024))+"G");
            int leng = raf1.read(buff);
            System.out.println(new String(buff,0,leng));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void method04() {
        // 一个简单的文件复制
        File file = new File("./stuFile/fileA/fileC/abc.wmv");// 读文件 不存在 直接报错
        File file1 = new File("./stuFile/fileA/copy_abc.wmv");// 一般写文件 不存在 会自动创建 但文件夹不会
        try (
                RandomAccessFile raf_r = new RandomAccessFile(file, "r");
                RandomAccessFile raf_w = new RandomAccessFile(file1, "rw");
        ) {
            byte[] buff = new byte[1024*10];
            int len = -1;
            while((len = raf_r.read(buff))!=-1){//每一次会读 10240 个长度的字节
                raf_w.write(buff,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * ##############################################################################
     * >>> <<
     *		 * d                          vvvvvvvv
     * 01111111 11111111 11111111 11111111
     *
     * 位操作符
     * >>>  将2进制整体向右移动指定位数
     * d>>>24                     vvvvvvvv
     * 00000000 00000000 00000000 01111111 11111111 11111111 11111111
     *
     * d>>>16                     vvvvvvvv
     * 00000000 00000000 01111111 11111111 11111111 11111111
     * <<	num<< n	相当于 num乘以2的n次幂，算数左移（逻辑左移）
     * >>	num>>n	相当于num除以2的n次幂，算数右移
     * >>>	num>>>n	逻辑右移，当num为正数和算术右移一个效果
     * ##############################################################################
     *
     **/
    @Test
    public void method05() {
        int a = 1234;
        String bin = Integer.toBinaryString(a);
        System.out.println("bin = "+ bin);//10011010010  11 位

        int b = 23;
        String bnst = Integer.toBinaryString(b);
        System.out.println("bnst = "+ bnst); // 10111 5 位

        //现在要给出 23的 16位二进制表示
        System.out.println(b<<2);//92  1011100
        System.out.println(Integer.toBinaryString(92));
        System.out.println(b>>>1);//11 移动一位 除以2
        System.out.println(b>>1);//11
    }

    /*
     * ##############################################################################
     * void writeInt(int d)
     * 连续写出4个字节，将该int值写出
     *
     *
     * void seek(long pos)
     * 将指针移动到指定位置
     * 移动到第一个字节的位置
     * raf.seek(0);
     *
     * int readInt()
     * 连续读取4个字节，还原该int值
     * 若读取过程中发现到了文件末尾，则抛出:
     * EOFException
     * EOF   end of file
     *
     * 连续读取8个字节
     * long l = raf.readLong();
     *
     * double dou = raf.readDouble();
     *
     * ##############################################################################
     *
     **/

    @Test
    public void method06() {
        File file = new File("./stuFile/fileA/raf03.txt");// 读文件 不存在 直接报错
        File file1 = new File("./stuFile/fileA/raf03.txt");// 一般写文件 不存在 会自动创建 但文件夹不会
        try (
                RandomAccessFile raf_w = new RandomAccessFile(file1, "rw");// 先写 要放在读的前面
                RandomAccessFile raf_r = new RandomAccessFile(file, "r");// 再读

        ) {
            //要想独处有意义的内容 需要 按照存的尺度喝顺序读取
            //比如存raf_w.writeInt 读的时候应该 raf_r.readInt()
            raf_w.writeInt(12);
            raf_w.writeInt(99);
            raf_w.writeInt(20);

            System.out.println("位置："+raf_r.getFilePointer());
            long res = raf_r.readLong();
            System.out.println("res :"+res);
            System.out.println("位置1："+raf_r.getFilePointer());
            raf_r.seek(0);
            System.out.println("位置2："+raf_r.getFilePointer());
            System.out.println(raf_r.readInt());
            System.out.println("位置3："+raf_r.getFilePointer());
            System.out.println(raf_r.readInt());
            System.out.println("位置4："+raf_r.getFilePointer());
            System.out.println(raf_r.readInt());
//            System.out.println(raf_r.readInt());/EOFException
            raf_r.seek(0);
            System.out.println(raf_r.readDouble());
            System.out.println("位置5："+raf_r.getFilePointer());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void method07() {
        byte[] data = new byte[0];
        try {
            data = "中国army".getBytes("UTF-8");
            System.out.println(data.length);
            // 数组扩容
            data = Arrays.copyOf(data, 32);
            System.out.println(data.length);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
