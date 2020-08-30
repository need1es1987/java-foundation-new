package hwinterfaces;

public class Fish implements Swimable {

    @Override
    public void swim() {
        System.out.println("Я рыба, люблю плавать!");
    }

    @Override
    public double maxSwimSpeed() {
        return 70;
    }
}
