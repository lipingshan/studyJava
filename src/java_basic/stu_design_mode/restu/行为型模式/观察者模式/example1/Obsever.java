package java_basic.stu_design_mode.restu.行为型模式.观察者模式.example1;

import java.util.Objects;

// 观察者的抽象类
public abstract class Obsever {
    protected String key;//注销凭证
    // 被观察对象
    protected Subject subject;


// 抽象类虽然 不可以new 但是可以有构造方法 ，用于子类初始化
    public Obsever(String key, Subject subject) {
        this.key = key;
        this.subject = subject;
        subject.register(this);
    }

    abstract void update();

    // list中删除对象需要重写eqals方法
    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obsever obsever = (Obsever) o;
        if(key.equals(obsever.key)){
            System.out.println("注销观察者：key="+key);
        }

        return key.equals(obsever.key);
    }


}
