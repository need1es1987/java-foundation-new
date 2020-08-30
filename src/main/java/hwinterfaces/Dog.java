package hwinterfaces;

public class Dog implements Runnable, Swimable, Walkable {

    @Override
    public void run() {
        System.out.println("Я собака люблю бегать!");
    }

    @Override
    public int maxRunDistance() {
        return 150;
    }

    @Override
    public void swim() {
        System.out.println("Я собака, я люблю плавать!");
    }

    @Override
    public double maxSwimSpeed() {
        return 13;
    }

    @Override
    public void walk() {
        System.out.println("Я собака, я люблю ходить");
    }
}
