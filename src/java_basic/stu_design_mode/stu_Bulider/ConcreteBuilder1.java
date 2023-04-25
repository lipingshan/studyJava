package java_basic.stu_design_mode.stu_Bulider;

import java.util.List;
//建造者实现类1
public class ConcreteBuilder1 implements Builder<Object,People> {
   private  People people = new People();
    @Override
    public String setName(String name) {
        people.setName(name);
        return name;
    }

    @Override
    public Integer setAge(int age) {
        people.setAge(age);
        return age;
    }

    @Override
    public Integer setScore(int score) {
        people.setScore(score);
        return score;
    }

    @Override
    public String setCity(String city) {
        people.setCity(city);
        return city;
    }

    @Override
    public List<String> setHobby(List<String> hobby) {
        people.setHobby(hobby);
        return hobby;
    }

    @Override
    public People getPeople() {
        return people;
    }
}
