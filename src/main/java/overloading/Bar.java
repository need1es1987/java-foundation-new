package overloading;

public class Bar {

    public static void main(String[] args) {
        Bottle waterBottle = new Bottle ("Saint spring", 0.8,"plastic", 8);
        Bottle.color = "blue";

        waterBottle.printBottle();
        waterBottle.printBottle(10);
        waterBottle.printBottle(1000);


        Bottle waterBottle2 = new Bottle("Shishkin les", 0.5, "plastic", 6);
        waterBottle2.printBottle();
        Bottle.color = "green";

        waterBottle.printBottle();
        waterBottle2.printBottle();

    }
}
