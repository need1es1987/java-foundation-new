package hwinterfaces;

import org.w3c.dom.ls.LSOutput;

public class Man implements Walkable, Swimable, Runnable {

    @Override
    public void run() {
        System.out.println("Я человек, люблю бегать!");
    }

    @Override
    public int maxRunDistance() {
        return 560;
    }

    @Override
    public void swim() {
        System.out.println("Я человек, люблю плавать!");
    }

    @Override
    public double maxSwimSpeed() {
        return 9.0;
    }

    @Override
    public void walk() {
        System.out.println("Я человек, люблю ходить!");
    }
}
