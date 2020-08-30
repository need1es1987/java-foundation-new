package hwinterfaces;

import interfaces.compare.Watch;

public class WorldInMotion {
    public static void main(String[] args) {

        Swimable swimMan = new Man ();
        swimMan.swim();
        System.out.println("Максимальная скорость плавания человвека = " + swimMan.maxSwimSpeed());

        Runnable runMan = new Man ();
        runMan.run();
        System.out.println("Максимальная дистанция бега человека = " + runMan.maxRunDistance());

        Walkable walkMan = new Man();
        walkMan.walk();

        Swimable fish = new Fish();
        fish.swim();
        System.out.println("Я рыба, плаваю очень быстро! Скорость = " + fish.maxSwimSpeed());

        Swimable swimDog = new Dog();
        swimDog.swim();
        System.out.println("Максимальная скорость плавания собаки = " + swimDog.maxSwimSpeed());

        Runnable runDog = new Dog();
        runDog.run();
        System.out.println("Я собака, бегаю очень много! Расстояни = " + runDog.maxRunDistance());

        Walkable walkDog = new Dog();
        walkDog.walk();

        Walkable walkCat  = new Cat();
        walkCat.walk();

        Runnable runCat = new Cat();
        runCat.run();
        System.out.println("Я кошка, люблю долго бегать! Расстояние = " + runCat.maxRunDistance());

        Flyable flyBird = new Bird();
        flyBird.fly();
        flyBird.flyMaxDistance();

        Runnable runBird = new Bird();
        runBird.run();
        System.out.println("Я птица, люблю ,бегать! Расстояние = " + runBird.maxRunDistance());

        Swimable swimBird = new Bird();
        swimBird.swim();
        System.out.println("Смотрите как далеко я уплыла! Скорость плавания птицы = " + swimBird.maxSwimSpeed());

        Walkable walkBird = new Bird();
        walkBird.walk();


    }
}
