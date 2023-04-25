package java_basic.stu_reflect.cell01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Init {
    public static Properties getPro() throws IOException {
        Properties pro=new Properties();
        System.out.println();

        System.out.println( System.getProperty("user.dir"));
        //System.out.println(Init.class.getResourceAsStream("fruit.properties"));
        File f=new File(Init.class.getResource("").getPath()+"/fruit.properties");
        FileInputStream fi = new FileInputStream(f);
        pro.load(fi);
        fi.close();
        return pro;
    }
}
