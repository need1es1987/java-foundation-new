package hwinterfaces.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Person implements Comparable<Person>, Cloneable {
    private final String name;
    private final String surname;
    private int age;


    @Override
    public int compareTo(Person person) {

        int personCompare = this.name.compareTo(person.name);
        if (personCompare == 0) {
            personCompare = this.surname.compareTo(person.surname);
            if (personCompare == 0) {
                personCompare = Double.compare(age, person.age);
                if (personCompare == 0) {
                    return personCompare;
                }
            }
        }
        return personCompare;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
