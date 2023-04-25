package java_basic.javaIO.stu01流的初步认识.demo01;

import org.junit.Test;

import java.io.*;
import java.math.BigDecimal;

/**
 * @Author lps
 * @Description //音频文件的复制 使用缓冲流
 * @Date 2021-02-20 10:43:17 周六
 * @Param
 * @return
 **/
public class CopyFile {
    @Test
    public void method() {
        String fileName1 = "D:\\baiduyunDataLearn\\state_data\\1java设计模式\\java设计模式系列\\java_design_model_parse\\1工厂模式\\01《设计模式精讲系列》简单工厂模式\\01简单工厂模式\\01简单工厂模式.wmv";
        File file1  = getFile(fileName1);
        String offset = file1.getName().split("\\.")[1];
        File file2 = createFile("./stuFile/fileA/fileC/abc."+offset);

        try (
                // 字节流
                InputStream inputStream = new FileInputStream(file1);
                OutputStream outputStream = new FileOutputStream(file2);
                // 缓冲流
                BufferedInputStream bis = new BufferedInputStream(inputStream);
                BufferedOutputStream bos = new BufferedOutputStream(outputStream);

        ) {

            // 读取数据
            byte[] bf = new byte[1024*10];
            int len = -1;
            double alreadByteSize=0;
            double total = file1.length();
            while((len=bis.read(bf))!=-1){
                alreadByteSize+=len;
//                System.out.println((alreadByteSize)+"  " +(total)+ "  "+ (alreadByteSize/total));
                BigDecimal b   =   new   BigDecimal(alreadByteSize*100/total);
                double   f1   =   b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
                System.out.println("已完成 "+(f1)+" %");
                bos.write(bf,0,len);


            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private  File getFile(String fileName){

        File file = new File(fileName);
        boolean e = file.exists();
        if (!e) {
            throw new RuntimeException("文件["+file.getName()+"]不存在");
        }
        return file;
    }
    // 文件夹不存在 则创建文件夹
    public  File createFile(String filepath) {
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
