package java_basic.stu_properties;

import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class OptionProperties {
    @Test
    public void method() throws Exception {
        //1.创建Properties对象
        Properties prop = new Properties();
        //2.获取文件输入流
        String dir =System.getProperty("user.dir");//项目目录

        File file = new File(dir+"/src/java_basic/stu_properties/aaa.properties");
        if(!file.exists()){
            file.createNewFile();
        }
        FileInputStream fis =new FileInputStream(file);
        //3.加载文件
         prop.load(fis);
        System.out.println( prop.getProperty("name"));
        System.out.println(prop.getProperty("age"));
        System.out.println(prop.get("hobby"));
        System.out.println(prop);//prop的类继承Hashtable

//

        fis.close();

    }
    @Test
    //可以向properties中添加键值对，都为键值都为String
    //下面的方法method01()有这样的功能，再添加时如果key值相等，后添加的会覆盖先添加的
    public void method01()throws  Exception {

        Properties prop =  new Properties();
        String dir =System.getProperty("user.dir");//项目目录
       //为了避免key值的重复，在添加前读一遍文件
        File file = new File(dir+"/src/java_basic/stu_properties/aaa.properties");
        FileInputStream fis = new FileInputStream(file);
        prop.load(fis);
        fis.close();
        System.out.println(JSON.toJSON(prop).toString());
        prop.put("age","22");
        prop.setProperty("weight","70kg");
        FileOutputStream fos = new FileOutputStream(file);//加参数true就是追加
        prop.store(fos,"user message");
        fos.close();
    }
}
