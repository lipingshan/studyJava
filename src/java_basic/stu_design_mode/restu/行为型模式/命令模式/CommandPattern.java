package java_basic.stu_design_mode.restu.行为型模式.命令模式;

public class CommandPattern {
    public static void main(String[] args) {
        //真正的处理逻辑
        Stock stock = new Stock(); // 我认为这个地方可以使用接口实现的方式达到松耦合，只不过小面调用的时候需要考虑不同的stock对象
        //根据业务请求选择处理对象
        Order buyStock = new BuyStock(stock);
        Order sellStock = new SellStock(stock);
        //将这些命令组织在一起
        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);
        //处理命令
        broker.handleOrder();
    }
}
