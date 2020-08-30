package core.hw.secondtask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private boolean isMale;
    private final String name;
    private double age;

    public Person(String name) {
        this.name = name;
    }

    public void printAge(){
    }
}