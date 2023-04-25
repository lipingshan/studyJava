package java_basic.stu_design_mode.restu.行为型模式.责任链模式;

public class ChainPattern {
    public static void main(String[] args) {
        // 创建节点
        Chain cellA = new CellA("A");
        Chain cellB = new CellB("B");
        Chain cellC = new CellC("C");

        // 将节点 组装成链

        cellA.setNext(cellB).setNext(cellC);
        cellA.operation("B");
        cellA.operation("A");

        cellA.operation("C");
    }
}
