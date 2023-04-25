package java_basic.java8new.cell_05;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
       // if (!super.equals(o)) return false;
        Person person = (Person) o;
       // System.out.println("xxxx"+this.name.equals(person.name));
        return this.name.equals(person.name);

    }

    @Override
    public int hashCode() {
       int result = 31 + (name != null ? name.hashCode() : 0);
        return result;
    }
}
