package java_basic.java8new;

import java_basic.java8new.cell_01.NewInterface;
import java_basic.java8new.cell_01.NewInterfaceImpl;
import org.junit.Test;

public class Main {
    @Test
    public void testInterface(){
        NewInterface interf  = new NewInterfaceImpl();
        System.out.println(interf.showMessage());
        System.out.println(interf.showName());
    }
}
