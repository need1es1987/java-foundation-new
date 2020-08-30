package hwinterfaces;

public class Cat implements Runnable, Walkable {

    @Override
    public void run() {
        System.out.println("Я кошка, я люблю бегать!");
    }

    @Override
    public int maxRunDistance() {
        return 10;
    }

    @Override
    public void walk() {
        System.out.println("Я кошка, люблю гулять пешком!");
    }
}

