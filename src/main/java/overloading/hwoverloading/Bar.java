package overloading.hwoverloading;

public class Bar {

    public static void main(String[] args) {
        Vodka alyaska = new Vodka("Alyaska", 0.03, 40, false);
        Vodka putinka = new Vodka("Putinka", 0.03, 42,true);

        alyaska.printVodka();
        putinka.printVodka();

        alyaska.drinkTooMuch(4);
        putinka.drinkTooMuch(10);
    }
}
