package core;

public class CatHouse {
    public static void main(String[] args) {

        Cat cat = new Cat();

        Lion leo = new Lion();
        leo.sayMew();

        Cat bagira = new Panther();
        bagira.sayMew();

        DomesticCat murochka = new DomesticCat("Murochka",3.0,true);

        System.out.println(murochka.getName());

    }
}
