package java_basic.stu_design_mode.restu.行为型模式.命令模式;

public class BuyStock implements  Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.buy();
    }
}
