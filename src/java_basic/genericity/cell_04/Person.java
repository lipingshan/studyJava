package java_basic.genericity.cell_04;

public class Person<E,W,T,U> {
    private E name;
    private W age;
    private T score;
    private U price;
    Person(E name, W age, T score,U price){
        this.name = name;
        this.age =  age;
        this.price = price;
        this.score = score;
    }

    //返回值为泛型
    public T showData(){
        return this.score;
    }

    String getData(){
        return "name="+name+" age="+age+" price="+price+" score="+score;
    }

}
