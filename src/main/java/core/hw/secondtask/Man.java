package core.hw.secondtask;

public class Man extends Person {

    public Man(String name, double age) {
        super(true, "Andrew",25);
    }

    @Override
    public void printAge() {
        System.out.println("Реальный возраст мужчины: " + super.getAge());
    }


}
