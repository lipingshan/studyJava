package java_basic.stu_design_mode.stu_Flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
  * @Description //非享元角色
  * @Author lps
  * @Date 2020-08-22 13:03:43 星期六
  * @Version 1.0
  **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UnsharedConcreteFlyweight {
    private String attribute;
    private String info;
}
