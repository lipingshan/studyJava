package java_basic.dataStruct.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Single01 {
    //111.map遍历
    public Map<String,Object> getMap(){
        Map<String, Object> map = new HashMap<String, Object>();
         map.put("aaa", 111);
         map.put("bbb", 222);
         map.put("ccc", 333);
         map.put("ddd", 444);
         return map;
    }
    @Test
    public void method01() {
        Map<String,Object> map = getMap();
        //1.map.entrySet()
        for(Map.Entry<String,Object> cur:map.entrySet()){
            System.out.println(cur.getKey()+"--"+cur.getValue());
        }
        //2.map.keySet()
        for(String cur:map.keySet()){
            System.out.println(cur+"*******"+map.get(cur));
        }
        //3.使用迭代器map.entrySet().iterator()
        Iterator<Map.Entry<String,Object>> it = map.entrySet().iterator();
       while(it.hasNext()){
           Map.Entry<String,Object> entry =  it.next();
           System.out.println(entry.getKey()+"XXXXXX"+entry.getValue());
       }

    }
}
