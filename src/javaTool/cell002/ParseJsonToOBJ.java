package javaTool.cell002;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//泛型的一些简单应用
public class ParseJsonToOBJ {

    /**
     * 1.将Json字符串信息转换成对应的Java对象
     *
     * @param json json字符串对象
     * @param c    对应的类型
     */
    public <T> T parseJsonToObj(String json, Class<T> c) {
        try {
            JSONObject jsonObject = JSONObject.parseObject(json);
            return JSON.toJavaObject(jsonObject, c);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
    @Test
    public void method(){
        //模拟获取json数据
        People people = new People("小明",23);
        Object obj = JSON.toJSON(people);
        //json数据转为对象
        People peo = parseJsonToObj(obj.toString(), people.getClass());
        System.out.println(peo.getName());
    }

    /**
     * 2 list集合添加是的非空过滤
     **/
    private static <T> void listAddAvoidNull(List<T> dest, T source) {
        if (source == null) {
            return;
        }
        dest.add(source);
    }
    @Test
    public void method1(){
        //参考文档https://www.cnblogs.com/jpfss/p/9928747.html
        List<People> list = new ArrayList();
        list.add(null);//这个null会被添加到数组中
        listAddAvoidNull(list,new People("小刚",24));
        listAddAvoidNull(list,new People("小红",26));
        listAddAvoidNull(list,null);
        System.out.println(JSON.toJSON(list).toString());
    }

}


