package java_basic.stu_design_mode.stu_Chain_of_Responsibility;

//具体处理者角色2
class ConcreteHandler3 extends Handler {
    public void handleRequest(String request) {
        if (request.equals("three")) {
            System.out.println("具体处理者3负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
