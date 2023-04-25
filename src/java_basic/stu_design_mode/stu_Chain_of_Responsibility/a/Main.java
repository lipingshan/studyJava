package java_basic.stu_design_mode.stu_Chain_of_Responsibility.a;

public class Main {
    public static void main(String[] args) {
        SingleA singleA = new SingleA();
        SingleB singleB = new SingleB();
        SingleC singleC = new SingleC();

        singleA.setNext(singleB);
        singleB.setNext(singleC);

        singleA.Operation("B");
    }
}
