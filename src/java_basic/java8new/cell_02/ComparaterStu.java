package java_basic.java8new.cell_02;

import java_basic.java8new.cell_01.NewInterface;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparaterStu {
    @Test
    public void main(){
        String res= demo_1(() ->"abc");
        System.out.println("res="+res);

        //System.out.println(ArraySort());
    }
    //接口作为参数，将实现放在调用
    public String  demo_1(NewInterface newInterface){
       return newInterface.showMessage();
    }

    //数组的排序
    public List<String> ArraySort(){
      List<String> list = new ArrayList();
      list.add("123");
      list.add("abvd");
      list.add("a");
        Collections.sort(list, (o1, o2) ->{
            if(o1.length()>o2.length()){
                return 1;
            }else if(o1.length()==o2.length()){
                return 0;
            }else{
                return -1;
            }
        });
        return list;
    }



}
