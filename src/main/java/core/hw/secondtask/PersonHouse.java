package core.hw.secondtask;

public class PersonHouse {

    public static void main(String[] args) {
        Person man = new Man("Andrew",25);
        man.printAge();
        Person woman = new Woman("Maria",18);
        woman.printAge();

        Person[] person = new Person[2];
        person[0] = man;
        person[1] = woman;

        for (int i = 0; i < person.length ;i++) {
            System.out.println("Возраст " + person[i].getName() + " = " + person[i].getAge());

        }
    }


}
