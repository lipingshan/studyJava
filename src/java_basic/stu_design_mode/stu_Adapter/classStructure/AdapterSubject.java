package java_basic.stu_design_mode.stu_Adapter.classStructure;

public class AdapterSubject extends Subject implements Target {
    @Override
    public int getNumber(int a,int b) {
        return getScore(a,b);
    }

    @Override
    public void option() {
        this.showMessage();
    }
}
