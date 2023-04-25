package java_basic.stu_design_mode.restu.行为型模式.命令模式;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order>  orderList;

    public Broker() {
        this.orderList = new ArrayList<>();
    }
    public void takeOrder(Order order){
        orderList.add(order);
    }
    public void handleOrder(){
        for(Order order:orderList){
            order.execute();
        }
    }

}
