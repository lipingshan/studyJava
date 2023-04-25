package javaTool.cell001;


import org.junit.Test;

public class Main {
    @Test
    public void method(){
        MultiObject<String> res =  new MultiObject<String>("hello world");
        System.out.println(res.getObj());
}
}
