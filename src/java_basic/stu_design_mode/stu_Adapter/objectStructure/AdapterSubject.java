package java_basic.stu_design_mode.stu_Adapter.objectStructure;

public class AdapterSubject implements Target{

    private Subject subject;
    AdapterSubject(){};
    AdapterSubject(Subject subject){
        this.subject = subject;
    }
    @Override
    public int getNumber(int a, int b) {
        return subject.getScore(a,b);
    }

    @Override
    public void option() {
       subject.showMessage();
    }
}
