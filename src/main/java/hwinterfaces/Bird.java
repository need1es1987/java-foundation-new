package hwinterfaces;

public class Bird implements Runnable, Walkable, Swimable, Flyable{

    @Override
    public void fly() {
        System.out.println("Я птица, люблю летать!");
    }

    @Override
    public String flyMaxDistance() {
        return ("Могу облететь весь земной шар");
    }

    @Override
    public void run() {
        System.out.println("Я птица, бегаю, но не очень люблю!");
    }

    @Override
    public int maxRunDistance() {
        return 1;
    }

    @Override
    public void swim() {
        System.out.println("Я птица, иногда плаваю довольно неплохо!");
    }

    @Override
    public double maxSwimSpeed() {
        return 5.3;
    }

    @Override
    public void walk() {
        System.out.println("Я птица, могу ходить медленно, но редко!");
    }
}
