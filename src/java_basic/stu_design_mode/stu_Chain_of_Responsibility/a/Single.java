package java_basic.stu_design_mode.stu_Chain_of_Responsibility.a;

abstract  public class Single {
    private Single next;
    void setNext(Single single){
        this.next = single;
    }
    public Single getNext(){
     return this.next;
    }
    public  abstract void Operation(String key);
}
