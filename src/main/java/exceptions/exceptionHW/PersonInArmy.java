package exceptions.exceptionHW;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PersonInArmy {

    private int age;

    public void setAge(int age) {
        if ((age < 18) || (age > 27)) {
            System.err.println("Поймали ошибку в setAge");
            throw new MyRuntimeException("NOT IN ARMY");
        }
        this.age = age;
    }

    public void birthday() {
        try {
            setAge(++age);
        } catch (Throwable throwable) {
            System.err.println("Поймали ошибку в birthday " + throwable.getMessage());
            throw new RuntimeException();
        }
    }


}

